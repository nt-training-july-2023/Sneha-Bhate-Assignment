// import { useNavigate } from "react-router-dom";
import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
export const Registration = () => {
  const navigate = useNavigate;

  const UserType = {
    ADMIN: "ADMIN",
    MEMBER: "MEMBER",
  };
  const forminitialvalues = {
    name: "",
    userType: UserType.ADMIN,
    email: "",
    password: "",
    department: {
      deptName: "HR",
      deptName: "Engineer",
    },
  };

  const [formdata, setformData] = useState(forminitialvalues);
  const formChange = (e) => {
    setformData({ ...formdata, [e.target.name]: e.target.value });
  };

  function registerHandler(e) {
    e.preventDefault();
    console.log(formdata);
    axios
      .post("http://localhost:8080/grievance/saveUser", formdata)
      .then((response) => {
        console.log(response.formdata);
        alert("Member Registerd");
        navigate("/admindashboard");
      })
      .catch((r) => console.log("Registered"));
  }
  return (
    <>
      <div className="container">
        <form action className="loginForm" onSubmit={registerHandler}>
          <h1 className="login">Registration</h1>
          <div className="row">
            <div className="formLabel">
              <label htmlFor="name">Name* :</label>
            </div>
            <input
              className="formInput"
              type="text"
              id="name"
              name="name"
              placeholder="Enter your name"
              onChange={formChange}
              required
            />
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="uname">Username* :</label>
            </div>
            <input
              className="formInput"
              type="email"
              id="eml"
              name="email"
              placeholder="Enter your email"
              onChange={formChange}
              required
            />
          </div>
          <div className="row">
            <div className="formLabel">
              <label htmlFor="password">Password* :</label>
            </div>
            <input
              className="formInput"
              type="password"
              id="password"
              name="password"
              placeholder="Enter your password"
              onChange={formChange}
              required
            />
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="userType">User-Type* :</label>
            </div>
            <select className="role" name="userType" onChange={formChange}>
              <option value={UserType.ADMIN}>ADMIN</option>
              <option value={UserType.MEMBER}>MEMBER</option>
            </select>
          </div>

          <div className="row">
            <div className="formLabel">
              <label htmlFor="dname">Department* :</label>
            </div>
            <select
              className="department"
              name="department"
              onChange={formChange}
            >
              <option value="department.deptName">HR</option>
              <option value="department.deptName">Engineer</option>
            </select>
          </div>
          <div className="row">
            <button type="submit">Register</button>
          </div>
        </form>
      </div>
    </>
  );
};

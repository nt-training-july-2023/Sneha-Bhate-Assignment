// import { useNavigate } from "react-router-dom";
import axios from "axios";
import { useState } from "react";
export const Registration = () => {
  const forminitialvalues = {
    name: "",
    userType: "",
    email: "",
    password: "",
    department: "",
  };

  const [formdata, setformData] = useState(forminitialvalues);
  const formChange = (e) => {
    setformData({ ...formdata, [e.target.name]: e.target.value });
  };

  function registerHandler(e) {
    e.preventDefault();
    console.log(formdata);
    axios
      .post("http://localhost:8080/grievance/save", formdata)
      .then((response) => {
        console.log(response.formdata);
        // navigate("/Registration");
      })
      .catch((r) => console.log("Please provide valid information"));
  }
  return (
    <>
      <div className="container">
        <form action className="loginForm" onSubmit={registerHandler}>
          <h1 className="login">Registration</h1>
          <div className="row">
            <div className="formLabel">
              <label for="name">Name* :</label>
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
              id="email"
              name="email"
              placeholder="Enter your email"
              onChange={formChange}
              required
            />
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="password">Password* :</label>
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
            <select className="role" name="role" onChange={formChange}>
              <option value="Admin">Admin</option>
              <option value="Member">Member</option>
            </select>
          </div>

          <div className="row">
            <div className="formLabel">
              <label for="dname">Department* :</label>
            </div>
            <select
              className="department"
              name="department"
              onChange={formChange}
            >
              <option value="HR">HR</option>
              <option value="Engineer">Engineer</option>
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

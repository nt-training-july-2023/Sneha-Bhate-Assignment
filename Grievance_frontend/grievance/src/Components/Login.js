import React from "react";
import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
export const Login = () => {
  const navigate = useNavigate();
  const initialvalues = {
    email: "",
    password: "",
  };
  const [data, setData] = useState(initialvalues);
  //const [message, setMessage] = useState("");
  //const display = () => console.log(data);

  const handleChange = (e) => {
    setData({ ...data, [e.target.name]: e.target.value });
  };
  function loginHandler(e) {
    e.preventDefault();
    const allowedDomain = "nucleusteq.com";
    const emailRegex = new RegExp(`^[A-Za-z0-5._%+-]+@${allowedDomain}$`);
    if (!emailRegex.test(data.email)) {
      alert(`Please enter a valid email with the domain ${allowedDomain}`);
      return;
    }
    const passwordRegex =
      /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*()])[a-zA-Z\d!@#$%^&*()]{8,}$/;
    if (!passwordRegex.test(data.password)) {
      alert(
        "Password must contain at least one uppercase letter, one lowercase letter, one digit, one special character, and be at least 8 characters long"
      );
      return;
    }
    console.log(data);
    // console.log(message);
    axios
      .post("http://localhost:8080/grievance/login", data)
      .then((response) => {
        console.log(response.data);
        alert("You are Logged In..");
        navigate("/registration");
      })
      .catch((r) => console.log("Invalid credentials"));
  }
  return (
    <>
      <div className="container">
        <form action className="loginForm" onSubmit={loginHandler}>
          <h1 className="login">Login</h1>
          <div class="row">
            <div class="formLabel">
              <label for="uname">Username* :</label>
            </div>
            <input
              className="formInput"
              type="email"
              value={data.email}
              id="email"
              name="email"
              placeholder="Enter your email"
              onChange={handleChange}
              required
            />
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="password">Password* :</label>
            </div>
            <div>
              <input
                className="formInput"
                type="password"
                value={data.password}
                style={{ width: "100%" }}
                id="password"
                name="password"
                placeholder="Enter your password"
                onChange={handleChange}
                required
              />
            </div>
          </div>
          <div className="row">
            <button type="submit" value="login">
              Login
            </button>
          </div>
        </form>
      </div>
    </>
  );
};

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
  // const [message, setMessage] = useState("");
  //const display = () => console.log(data);

  const handleChange = (e) => {
    setData({ ...data, [e.target.name]: e.target.value });
  };
  function loginHandler(e) {
    e.preventDefault();
    const allowedDomain = "nucleusteq.com";
    const emailRegex = new RegExp(`^[A-Za-z0-9._%+-]+@${allowedDomain}$`);
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
        navigate("/blank");
      })
      .catch((r) => console.log("Invalid credentials"));
  }
  return (
    <div className="container">
      <div className="title">Login</div>
      <form onSubmit={loginHandler}>
        <div className="Userdetails">
          <div className="input-box" required>
            <span className="details">Username</span>
            <input
              className="e"
              type="email"
              placeholder="Enter your username : "
              value={data.email}
              name="email"
              id="email"
              onChange={handleChange}
              required
            />
          </div>
          <div className="input-box" required>
            <span className="details">Password</span>
            <input
              type="password"
              placeholder="Enter your password : "
              value={data.password}
              name="password"
              id="password"
              onChange={handleChange}
              required
            />
          </div>
        </div>
        <button type="submit" value="login">
          Login
        </button>
      </form>
    </div>
  );
};

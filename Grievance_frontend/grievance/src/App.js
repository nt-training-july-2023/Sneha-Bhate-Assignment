import "./App.css";
import "./Login.css";
import Home from "./Components/Home";
import Navbar from "./Components/Navbar";
import { Login } from "./Components/Login";
import { Routes, Route } from "react-router-dom";
import Blank from "./Components/Blank.js";

function App() {
  return (
    <>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Login" element={<Login />} />
        <Route path="/Blank" element={<Blank />} />
        {/* <h1>Grievance Management System</h1> */}
      </Routes>
    </>
  );
}

export default App;

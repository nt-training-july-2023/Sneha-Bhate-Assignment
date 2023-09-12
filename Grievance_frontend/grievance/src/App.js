import "./Login.css";
import "./Department.css";
import { Login } from "./Components/Login";
import { Registration } from "./Components/Registration";
import { Routes, Route } from "react-router-dom";
import "./Registration.css";
import { Ticket } from "./Components/Ticket";
import "./Ticket.css";
import "./Nav.css";
import { Department } from "./Components/Department";

import Navbar from "./Components/Navbar";
import { AdminDashboard } from "./Components/AdminDashboard";
import "./AdminDashboard.css";

function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/registration" element={<Registration />} />
        <Route path="/ticket" element={<Ticket></Ticket>}></Route>
        <Route path="/department" element={<Department />}></Route>
        <Route
          path="/admindashboard"
          element={((<AdminDashboard />), (<Navbar></Navbar>))}
        ></Route>
        {/* <h1>Grievance Management System</h1> */}
      </Routes>
    </>
  );
}

export default App;

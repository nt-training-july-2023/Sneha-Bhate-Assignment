import React, { useEffect } from "react";
import { useState } from "react";
import axios from "axios";
export const Ticket = () => {
  const TicketType = {
    GRIEVANCE: "GRIEVANCE",
    FEEDBACK: "FEEDBACK",
  };
  const ticketStatus = {
    OPEN: "OPEN",
    BEING_ADDRESSED: "BEING_ADDRESSED",
    RESOLVED: "RESOLVED",
  };

  const forminitialvalues = {
    ticketType: TicketType.GRIEVANCE,
    ticketStatus: ticketStatus.OPEN,
    description: "",
    ticketTitle: "",
    department: {
      deptName: "",
    },
    userDetails: {
      name: "Aayushi",
      userType: "ADMIN",
      password: "Aasyushi@01",
      email: "aayushi@nucleusteq.com",
      isLoggedIn: false,
    },
  };

  const [dept, setDept] = useState([]);

  useEffect(() => {
    axios({
      url: "http://localhost:8080/grievance/getAllDepartments",
      method: "GET",
    })
      .then((res) => {
        setDept(res.data);
        console.log(res.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  const [formdata, setformData] = useState(forminitialvalues);
  const deptChange = (e) => {
    console.log(e.target.value);
    let updateformData = {
      ...formdata,
      department: {
        ...formdata.department,
        deptName: e.target.value,
      },
    };
    setformData(updateformData);
  };
  const formChange = (e) => {
    console.log(e.target.name + " " + e.target.value);
    setformData({ ...formdata, [e.target.name]: e.target.value });
  };

  function ticketHandler(e) {
    e.preventDefault();
    console.log(formdata);
    axios
      .post("http://localhost:8080/grievance/saveTicket", formdata)
      .then((response) => {
        console.log(response.formdata);
        alert("Ticket Raised");
        //   navigate("/admindashboard");
      })
      .catch((r) => console.log(Error));
  }
  return (
    <>
      <div className="container">
        <form action className="loginForm" onSubmit={ticketHandler}>
          <h1 className="login">Ticket</h1>
          <div className="row">
            <div className="formLabel">
              <label for="ticket">Ticket Type* :</label>
            </div>
            <select
              className="ticket-type"
              name="ticketType"
              onChange={formChange}
            >
              <option value="GRIEVANCE">Grievance</option>
              <option value="FEEDBACK">Feedback</option>
            </select>
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="title">Title* :</label>
            </div>
            <input
              className="formInput"
              type="text"
              id="title"
              name="ticketTitle"
              placeholder="Enter title of the ticket"
              onChange={formChange}
              required
            />
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="description">Description* :</label>
            </div>
            <input
              className="formInput"
              type="text"
              id="description"
              name="description"
              placeholder="Enter description"
              onChange={formChange}
              required
            />
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="utype">Assigned to* :</label>
            </div>
            {/* <select className="assign" name="deptName" onChange={deptChange}>
              <option value="HR">HR</option>
              <option value="Engineer">Engineer</option>
              <option value="Operational">Operational</option>
            </select> */}
            <select className="assign" name="deptName" onChange={deptChange}>
              {dept.map((e) => {
                return <option>{e.deptName}</option>;
              })}
            </select>
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="status">Status* :</label>
            </div>
            <select className="status" name="status" onChange={formChange}>
              <option value="open">Open</option>
              <option value="closed">Closed</option>
              <option value="beingAddressed">Being Addressed</option>
            </select>
          </div>
          <div className="row">
            <button type="submit">Raise the ticket</button>
          </div>
        </form>
      </div>
    </>
  );
};

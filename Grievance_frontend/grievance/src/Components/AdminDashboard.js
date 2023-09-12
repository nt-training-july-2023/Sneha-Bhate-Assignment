import React from "react";

export const AdminDashboard = () => {
  return (
    <div className="dashboardContainer">
      <div className="sidebar">
        <a class="active" href="#home">
          Home
        </a>
        <a href="#news">News</a>
        <a href="#contact">Contact</a>
        <a href="#about">About</a>
      </div>
      <div className="content">
        <h1>Dashboard</h1>
      </div>
    </div>
  );
};

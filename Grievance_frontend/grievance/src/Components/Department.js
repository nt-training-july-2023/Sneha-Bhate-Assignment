import React from "react";
export const Department = () => {
  return (
    <div className="departmentContainer">
      <form action className="departmentForm">
        <h1 className="department">Department</h1>
        <div className="row">
          <div className="formLabel">
            <label for="department">Department Name :</label>
          </div>
          <input
            className="formInput"
            type="text"
            // value={data.email}
            id="department"
            name="department"
            placeholder="Enter the department"
            // onChange={handleChange}
            required
          />
        </div>
        <div className="row">
          <button type="submit" value="addDepartment">
            Add Department
          </button>
        </div>
      </form>
    </div>
  );
};

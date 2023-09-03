export const Ticket = () => {
  return (
    <>
      <div className="container">
        <form action className="loginForm">
          <h1 className="login">Ticket</h1>
          <div className="row">
            <div className="formLabel">
              <label for="ticket">Ticket Type* :</label>
            </div>
            <select className="ticket-type" name="ticket-type">
              <option value="greivance">Grievance</option>
              <option value="feedback">Feedback</option>
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
              name="title"
              placeholder="Enter title of the ticket"
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
              required
            />
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="utype">Assigned to* :</label>
            </div>
            <select className="assign" name="assign">
              <option value="HR">HR</option>
              <option value="Engineer">Engineer</option>
            </select>
          </div>
          <div className="row">
            <div className="formLabel">
              <label for="status">Status* :</label>
            </div>
            <select className="status" name="status">
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

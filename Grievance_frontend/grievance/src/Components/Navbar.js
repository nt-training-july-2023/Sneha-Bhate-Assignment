// import { Link } from "react-router-dom/dist/umd/react-router-dom.development"

function Navbar() {
  return (
    <div>
      {" "}
      <header>
        {/* <!-- navbar --> */}
        <nav>
          <div className="left">Grievance Management System</div>
          <div className="right">
            <ul>
              <li>Home</li>
              <li>About</li>
              <li>Login</li>
              <li>Contact Us</li>
            </ul>
            {/* <h1>Login</h1> */}
          </div>
        </nav>
      </header>
    </div>
  );
}

export default Navbar;

import { useNavigate } from "react-router-dom";
function Home() {
  const navigate = useNavigate();
  function gotoLogin() {
    navigate("/Login");
  }
  return (
    <div>
      <h1>Grievance Management System</h1>
      <button className="btn" onClick={gotoLogin}>
        Click to Login !!
      </button>
    </div>
  );
}
export default Home;

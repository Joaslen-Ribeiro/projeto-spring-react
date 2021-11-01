import NavBar from "components/NavBar";
import Footer from "components/NavBar/Footer";
import DataTable from "components/NavBar/DataTable";

function App() {
  return (
    <>
    <NavBar/>
    <div className="container">
      <h1 className="text-primary">Olá mundo!</h1>
      <DataTable/>
    </div>
    <Footer/>
    </>
  );
}

export default App;

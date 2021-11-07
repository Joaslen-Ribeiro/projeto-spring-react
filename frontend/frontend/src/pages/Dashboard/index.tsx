import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonuChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">Lista de Vendas</h1>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5>Porcentagem de sucesso</h5>
                        <BarChart />

                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Todas as vendas</h5>
                        <DonutChart />
                    </div>
                </div>

                <div className="py-3">
                    <h2 className="text-primary"> Todas as vendas</h2>

                </div>

                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;

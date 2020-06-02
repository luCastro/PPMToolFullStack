import React from "react";
import "./App.css";
import Dashboard from "./components/Dashboard";
import Header from "./components/layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import "font-awesome/css/font-awesome.min.css";
import { BrowserRouter as Router, Route } from "react-router-dom";
import AddProject from "./components/projects/AddProject";



function App() {
  return (

    <Router>

      <div className="App">
        <Header />
        <Dashboard />
        <Route exact path="/addProject" component={AddProject} />
      </div>

    </Router>
  );
}

export default App;

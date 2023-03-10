import React from 'react'
import { useNavigate } from "react-router-dom";


const Home = () => {
    const navigate = useNavigate();
    return (
        <div>
            home
            <button onClick={() => navigate("/form")}>Fill up details</button>
        </div>
    )
}

export default Home

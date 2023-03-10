import React, { useState, useEffect } from "react";
import axios from "axios";
// import "./create.css";
import Table1 from "./table";

const Create = () => {

    const initialState = {
        s_no: "",
        college_Name: "",
        nIRF: "",
        user_rating: "",
        aICETE_Approved: "",
        location: "",
        outlook_Rating: ""
    }

    const [details, setDetails] = useState(initialState);

    const eventShow = () => {
        axios.post("http://localhost:2020/add", details)
        console.log(details);
    }

    const eventHandler = (event) => {
        setDetails({ ...details, [event.target.name]: event.target.value })
    }

    return (
        <>
            <input placeholder="Serial Number" name="s_no" onChange={eventHandler}/>
            <input placeholder="college_name" name="college_Name" onChange={eventHandler}/>
            <input placeholder="nIRF Ranking" name="nIRF" onChange={eventHandler}/>
            <input placeholder="User Rating" name="user_rating" onChange={eventHandler}/>
            <input placeholder="aICETE" name="aICETE_Approved" onChange={eventHandler}/>
            <input placeholder="Location" name="location" onChange={eventHandler}/>
            <input placeholder="Rating" name="outlook_Rating" onChange={eventHandler}/>
            <button onClick={eventShow}>SUBMIT</button>

            <Table1/>
        </>
    );

}


export default Create;
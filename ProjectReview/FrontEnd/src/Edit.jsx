import React, { useState, useEffect } from 'react'
import axios from 'axios'
import { useNavigate, useParams } from 'react-router-dom';
import './edit.css';

const Edit = () => {

    const { id } = useParams();

    const navigate = useNavigate();

    console.log(id);

    const initialState = {
        s_no: id,
        college_Name: "",
        nIRF: "",
        user_rating: "",
        aICETE_Approved: "",
        location: "",
        outlook_Rating: ""
    }
    const [details, setDetails] = useState(initialState);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await axios.get(" http://localhost:2020/get/" + id);
                setDetails(response.data);
                // console.log(response.data);
                console.log(details);
            }
            catch (err) {
                console.log(err);
            }
        }
        fetchData();
    }, []);

    const eventHandler = (event) => {
        setDetails({ ...details, [event.target.name]: event.target.value })
    }


    const eventShow = () => {
        axios.put(" http://localhost:2020/update/" + id, details);
        navigate("/form")
    }

    return (
        <div>
            <h1>Edit</h1>
            <input placeholder="Enter the College Name" name="college_Name" onChange={eventHandler} value={details.college_Name}/>
            <input placeholder="nirf" name="nIRF" onChange={eventHandler} value={details.nIRF}/>
            <input placeholder="user_rating" name="user_rating" onChange={eventHandler} value={details.user_rating}/>
            <input placeholder="aicte" name="aICETE_Approved" onChange={eventHandler} value={details.aICETE_Approved}/>
            <input placeholder="location" name="location" onChange={eventHandler} value={details.location}/>
            <input placeholder="rating" name="outlook_Rating" onChange={eventHandler} value={details.outlook_Rating}/>
            <button onClick={eventShow}>SUBMIT</button>
        </div>
    )
}

export default Edit;

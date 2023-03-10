import axios from "axios";
import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import './table.css';

const Table1 = () => {

    const navigate = useNavigate();

    const [details, setDetails] = useState([]);

    useEffect(() => {

        const fetchData = async () => {
            try {
                const response = await axios.get("http://localhost:2020/list");
                setDetails(response.data);
                console.log(details)
            }
            catch (error) {
                console.log(error);
            }
        }
        fetchData();
    }, []);

    const eventEdit = (event, id) => {
        event.preventDefault();
        navigate(`/edit/${id}`)
    }


    console.log(details);

    return (
        <>
            <table border={2}>
                <tr>
                    <th>s_no</th>
                    <th>college_Name</th>
                    <th>nIRF</th>
                    <th>user_rating</th>
                    <th>aICETE_rating</th>
                    <th>location</th>
                    <th>outlook_Rating</th>
                    <th>Actions</th>
                </tr>
                {
                    details.map((user) => {
                        return (
                            <tr key={user.s_no}>
                                <td>{user.s_no}</td>
                                <td>{user.college_Name}</td>
                                <td>{user.nIRF}</td>
                                <td>{user.user_rating}</td>
                                <td>{user.aICETE_Approved}</td>
                                <td>{user.location}</td>
                                <td>{user.outlook_Rating}</td>
                                <button onClick={(event, id) => eventEdit(event, user.s_no)}>EDIT</button>
                                <button onClick={() => axios.delete(`http://localhost:2020/delete/${user.s_no}`)}>DELETE</button>
                            </tr>
                        );
                    })
                }
            </table>
        </>
    );
}

export default Table1;
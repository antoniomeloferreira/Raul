import { useState } from "react";
import axios, { AxiosResponse } from 'axios'
import { LOGIN_URL } from "../../Constant/Constant";
import { RaulUser } from "../../Types/Types";
import { setCurrentUser } from "../Authentication";

interface Props {
    setIsLogin: Function
};

interface LoginData {
    username: string,
    password: string
}

export const Login = ({setIsLogin} : Props) => {

    const[username, setUsername] = useState<string>("");
    const[password, setPassword] = useState<string>("");

    const loginUser = () => {
        
        const loginData : LoginData = {
            username : username,
            password : password,
        }

        axios({
    
            method: "post",
            url: LOGIN_URL,
            data: loginData
    
        }).then((response: AxiosResponse) => {
            
            let user : RaulUser = response.data;
            
            if (user) {
                setCurrentUser(user);
            }

        }).catch(() => {
            //setShowErrorMessage(true);            
        });

    }

    return (
        <div>
            
            <div className="formContainer">
                <div className="form">
                    <h1 className="cardTitle">Login</h1>
                    <input type="text" placeholder="Username" onChange={event => setUsername(event.target.value)}></input>
                    <input type="password" placeholder="Password" onChange={event => setPassword(event.target.value)}></input>
                    <div className="btnContainer">
                        <button onClick={() => loginUser()}>Login</button>
                    </div>
                </div>
            </div>

            <br/>
            <button onClick={() => setIsLogin(false)}>Register</button>
        </div>
    );
}
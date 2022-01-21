import { useState } from "react";
import axios, { AxiosResponse } from 'axios'
import { REGISTER_URL } from "../../Constant/Constant";

interface Props {
    setIsLogin: Function
};

interface RegisterData {
    name: string,
    username: string,
    password: string
}

export const Register = ({setIsLogin} : Props) => {

    const [name, setName] = useState<string>("");
    const [username, setUsername] = useState<string>("");
    const [password, setPassword] = useState<string>("");

    const [showUsernameWarning, setUsernameWarning] = useState<boolean>(false);

    const registerUser = () => {
        
        const registerData : RegisterData = {
            name: name,
            username: username,
            password: password
        };

        axios({
    
            method: "post",
            url: REGISTER_URL,
            data: registerData
    
        }).then((response: AxiosResponse) => {

            console.log(response.data);
  
        }).catch(() => {

            setUsernameWarning(true);

            setTimeout(() => setUsernameWarning(false) , 500);
        });
    }

    return (
        <>
            <div>
                <h1>Register</h1>
                <div className="form-container">
                    <input type="text" placeholder="Name" onChange={event => setName(event.target.value)}></input>
                    <input type="text" placeholder="Username" onChange={event => setUsername(event.target.value)}></input>
                    <input type="password" placeholder="Password" onChange={event => setPassword(event.target.value)}></input>
                    <button onClick={() => registerUser()}>Register</button>
                </div>
                
                <br/>
                <button onClick={() => setIsLogin(true)}>Return to Login</button>
            </div>

            {showUsernameWarning ? 
                <div>
                    <h2>Username already registered</h2>
                </div> : null}
        </>
    );
}
import { useState } from "react";
import { BrowserStorage } from "../Enum/Enum";
import { RaulUser } from "../Types/Types";
import { Login } from "./Login/Login";
import { Register } from "./Register/Register";

export const getCurrentUser = (): RaulUser => {
    let storedUserJson = localStorage.getItem(BrowserStorage.GET_USER);
    return storedUserJson != null ? JSON.parse(storedUserJson) : null;
};

export const setCurrentUser = (user: RaulUser): void => {
    localStorage.setItem(BrowserStorage.GET_USER, JSON.stringify(user))
    window.location.reload();
}

export const logout = (): void => {
    localStorage.removeItem(BrowserStorage.GET_USER);
    window.location.reload();
};

export const Authentication = () => {

    const [isLogin, setIsLogin] = useState<boolean>(true);
    
    return (
        <div>
            {isLogin ? <Login setIsLogin={setIsLogin} /> : <Register setIsLogin={setIsLogin}/>}
        </div>
    );
}
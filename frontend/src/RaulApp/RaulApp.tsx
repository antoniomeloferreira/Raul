import { logout } from "../Authentication/Authentication";

export const RaulApp = () => {
    return (
        <div>
            RaulAPp
            <button onClick={() => logout()}>Logout</button>
        </div>
    );
}
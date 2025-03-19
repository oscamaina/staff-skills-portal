import React, { useState } from "react";

function StaffForm({ onSave }) {
    const [staff, setStaff] = useState({ fullName: "", email: "", dutyStation: "" });

    const handleChange = (e) => setStaff({ ...staff, [e.target.name]: e.target.value });

    return (
        <div>
            <h2>Add Staff</h2>
            <input name="fullName" placeholder="Full Name" onChange={handleChange} />
            <input name="email" placeholder="Email" onChange={handleChange} />
            <button onClick={() => onSave(staff)}>Save</button>
        </div>
    );
}

export default StaffForm;

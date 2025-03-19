import React, { useEffect, useState } from "react";

function StaffList() {
    const [staffList, setStaffList] = useState([]);

    useEffect(() => {
        fetch("/api/staff")
            .then((res) => res.json())
            .then((data) => setStaffList(data));
    }, []);

    return (
        <div>
            <h2>Staff List</h2>
            {staffList.map((staff) => (
                <div key={staff.id}>
                    {staff.fullName} - {staff.email} - {staff.dutyStation}
                </div>
            ))}
        </div>
    );
}

export default StaffList;

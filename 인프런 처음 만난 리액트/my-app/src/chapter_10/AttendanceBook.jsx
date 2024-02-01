import React from "react";

const students = [
    {
        id: 1,
        name: "민균오빠🥰",
    },
    {
        id: 2,
        name: "메에에🐏",
    },
    {
        id: 3,
        name: "먀먕🐶",
    },
    {
        id: 4,
        name: "내 사랑😘",
    },
    {
        id: 5,
        name: "오리들썩🦆",
    },
];

//key를 id로 사용하기
function AttendanceBook(props){
    return (
        <ul>
            {students.map((student) => {
                return <li key={student.id}>{student.name}</li>;
            })}
        </ul>
    );
}

export default AttendanceBook;

/*
key를 포맷팅 된 문자열로 사용하기
function AttendanceBook(props){
    return (
        <ul>
            {students.map((student) => {
                return <li key={`student-id-${student.id}`}>{student.name}</li>;
            })}
        </ul>
    );
}

key를 index로 사용하기
function AttendanceBook(props){
    return (
        <ul>
            {students.map((student, index) => {
                return <li key={index}>{student.name}</li>;
            })}
        </ul>
    );
}
*/
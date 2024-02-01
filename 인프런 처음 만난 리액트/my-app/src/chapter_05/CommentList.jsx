import React from "react";
import Comment from "./Comment";

const comments = [
    {
        name: "고나령",
        comment: "나는야 호랑이 어흥🐯",
    },{
        name: "고나령",
        comment: "배고팡",
    },{
        name: "고나령",
        comment: "아쉬워 아직 10시 17분~",
    },
];

function CommentList(props) {
    return (
        <div>
            {comments.map((comment) => {
                return (
                    <Comment name={comment.name} comment={comment.comment} />
                );
            })}
        </div>
    );
}

export default CommentList;
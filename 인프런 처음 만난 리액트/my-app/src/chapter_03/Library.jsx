import React from "react";
import Book from "./Book";

function Library(props){
    return (
        <div>
            <Book name ="나는 책이다" numOfPage={27} />
            <Book name ="나도 책이다" numOfPage={31} />
            <Book name ="우리는 책이다" numOfPage={363} />
        </div>
    );
}

export default Library;
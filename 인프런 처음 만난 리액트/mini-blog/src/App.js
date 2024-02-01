import React from "react";
import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import styled from "styled-components";
// Pages
import MainPage from './component/page/MainPage';
import PostWritePage from './component/page/PostWritePage';
import PostViewPage from './component/page/PostViewPage';

const MainTiileText = styled.p`
  font-size: 24px;
  font-weight: bold;
  text-align: center;
`;

function App(props) {
  return (
    <BrowserRouter>
    <MainTiileText>나롱 미니 블로그</MainTiileText>
    <Routes>
      <Route index element={<MainPage/>}/>
      <Route path="post-write" element={<PostWritePage/>}/>
      <Route path="post/:postId" element={<PostViewPage/>}/>
    </Routes>
    </BrowserRouter>  
  );
}

export default App;

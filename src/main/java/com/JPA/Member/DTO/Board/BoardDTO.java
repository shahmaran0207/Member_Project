package com.JPA.Member.DTO.Board;

import org.springframework.web.multipart.MultipartFile;
import com.JPA.Member.Entity.Board.BoardEntity;
import java.time.LocalDateTime;
import lombok.*;

@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
@NoArgsConstructor //기본 생성자
@ToString
@Getter
@Setter
public class BoardDTO {

    private Long id;

    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private String originalFileName; // 원본 파일 이름
    private String storedFileName; // 서버 저장용 파일 이름
    private String memberName;

    private int boardHits;
    private int fileAttached; // 파일 첨부 여부(첨부 1, 미첨부 0)
    private int likesCount;

    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

    private MultipartFile boardFile; // save.html -> Controller 파일 담는 용도

    public BoardDTO(Long id, String boardTitle, int boardHits, LocalDateTime boardCreatedTime, String memberName, int likesCount) {
        this.id = id;
        this.boardTitle = boardTitle;
        this.boardHits = boardHits;
        this.boardCreatedTime = boardCreatedTime;
        this.memberName = memberName;
        this.likesCount =likesCount;
    }

    public static BoardDTO toBoardDTO(BoardEntity boardEntity) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(boardEntity.getId());
        boardDTO.setBoardPass(boardEntity.getBoardPass());
        boardDTO.setBoardTitle(boardEntity.getBoardTitle());
        boardDTO.setBoardContents(boardEntity.getBoardContents());
        boardDTO.setBoardHits(boardEntity.getBoardHits());
        boardDTO.setBoardCreatedTime(boardEntity.getCreatedTime());
        boardDTO.setBoardUpdatedTime(boardEntity.getUpdatedTime());
        boardDTO.setLikesCount((boardEntity.getLikesCount()));

        boardDTO.setMemberName(boardEntity.getMemberEntity().getMemberName());

        if (boardEntity.getFileAttached() == 0) {
            boardDTO.setFileAttached(boardEntity.getFileAttached()); // 0
        } else {
            boardDTO.setFileAttached(boardEntity.getFileAttached()); // 1
            boardDTO.setOriginalFileName(boardEntity.getBoardFileEntityList().get(0).getOriginalFileName());
            boardDTO.setStoredFileName(boardEntity.getBoardFileEntityList().get(0).getStoredFileName());
        }

        return boardDTO;
    }

}
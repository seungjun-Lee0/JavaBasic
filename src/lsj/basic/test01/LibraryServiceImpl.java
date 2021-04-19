package lsj.basic.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {

    List<LibraryVO> lvdata = new ArrayList<>();
    LibraryVO lv = null;

    private static LibraryService ls = null;
    private LibraryServiceImpl(){}

    public static LibraryService getInstance(){
        if(ls == null)
            ls = new LibraryServiceImpl();
            return ls;
    }


    @Override
    public void displayMenu() {
        String displayMenu =
                          "-----------------------------------\n"
                        + "    전국 도서관 등록/조회 프로그램 \n"
                        + "-----------------------------------\n"
                        + "1. 도서관 정보 입력	         	  \n"
                        + "2. 도서관 정보 조회	              \n"
                        + "3. 도서관 정보 상세조회            \n"
                        + "4. 도서관 정보 수정	              \n"
                        + "5. 도서관 정보 삭제	              \n"
                        + "0. 프로그램 종료 		          \n"
                        + "-----------------------------------\n"
                        + "옵션 선택:";

        System.out.print(displayMenu);
    }

    @Override
    public void readLibraryInfo() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("도서관명을 입력하세요");
            String lbname = sc.next();

            System.out.println("시/도명을 입력하세요");
            String sido = sc.next();

            System.out.println("시/군/구명을 입력하세요");
            String gugun = sc.next();

            System.out.println("도서관 유형을 입력하세요");
            String lbtype = sc.next();

            System.out.println("휴관일을 입력하세요");
            String clsday = sc.next();

            System.out.println("소재지도로명주소를 입력하세요");
            String addr = sc.next();

            System.out.println("도서관전화번호를 입력하세요");
            String phone = sc.next();

            System.out.println("홈페이지 주소를 입력하세요");
            String homepage = sc.next();

            System.out.println("위도를 입력하세요");
            double lat = sc.nextDouble();

            System.out.println("경도를 입력하세요");
            double lon = sc.nextDouble();

            System.out.println("저장 완료");

            lv = new LibraryVO(lbname, sido, gugun, lbtype, clsday
                    , addr, phone, homepage, lat, lon);
            lvdata.add(lv);
        }catch (Exception ex){
            System.out.println("잘못 입력하셨습니다");
            return;
        }
    }

    @Override
    public void writeListOfLibraryInfo() {
        String fmt = "[도서관명]: %s [시도명]: %s [시군구명]: %s\n" +
                "[도서관유형]: %s [휴관일]: %s\n" +
                "------------------------------------------------------------------\n";

        for(LibraryVO lv : lvdata){
            System.out.printf(fmt, lv.getLbname(), lv.getSido(), lv.getGugun(),
                    lv.getLbtype(), lv.getClsday());
        }
    }

    @Override
    public void writeLibraryInfo() {
        String fmt = "[도서관명]: %s [시도명]: %s [시군구명]: %s\n" +
                "[도서관유형]: %s [휴관일]: %s\n[소재지도로명주소]: %s\n" +
                "[도서관전화번호]: %s [홈페이지주소]: %s\n" +
                "[위도]: %f [경도]: %f\n" +
                "------------------------------------------------------------------\n";
        Scanner sc = new Scanner(System.in);
        System.out.println("도서관명을 입력하세요");
        String libName = sc.next();

        try{
        for(LibraryVO lv : lvdata){
            if(libName.equals(lv.getLbname())) {
                System.out.printf(fmt, lv.getLbname(), lv.getSido(), lv.getGugun(),
                        lv.getLbtype(), lv.getClsday(), lv.getAddr(), lv.getPhone(),
                        lv.getHomepage(), lv.getLat(), lv.getLon());
            }
            else{
                System.out.println("도서관이 존재하지 않습니다");
            }
        }}catch(Exception e){
            System.out.println("도서관이 존재하지 않습니다");
            return;
        }
    }

    @Override
    public void modifyLibraryInfo() {

    }

    @Override
    public void removeLibraryInfo() {

    }
}

package MyWay;

import java.util.Scanner;
import java.util.Random;

public class myway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Answer;
		Scanner scan = new Scanner(System.in);
		System.out.println("###### 팀노바에 오게 된 상황  ######");
		System.out.println("스터디 팀원이 팀노바 블로그를 링크해주었다");
		System.out.print("본다(Y), 안본다(N) : ");
		Answer = scan.next();
		scan.nextLine();
		if (Answer.equals("Y") || Answer.equals("y")) {
			System.out.print("링크를 연다(Y), 열지 않는다(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("팀노바 블로그를 본다");
				System.out.println("1. 목차를 살펴본다");
				System.out.println("2. 보고 싶은 부분부터 본다");
				System.out.print("선택(1,2) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1")) {
					System.out.println("1. 목차 순서대로 살펴본다");
					System.out.println("2. 보고싶은 목차부터 본다");
					System.out.print("선택(1,2) : ");
					Answer = scan.next();
					scan.nextLine();
					System.out.println("");
					if (Answer.equals("1")) {
						System.out.println("\"팀노바소개\"를 본다");
						System.out.println("\"팀노바 수강 신청 공지\"를 본다");
						System.out.println("\"팀노바 팀원공지\"를 본다");
						System.out.println("\"팀노바관련링크\"를 본다");
						System.out.println("\"팀노바풍경\"을 본다");
						System.out.println("\"팀노바팀원작품(기초)\"을 본다");
						System.out.println("\"팀노바팀원작품(응용)\"을 본다");
						System.out.println("\"팀노바수료자영상\"을 본다");
						System.out.println("\"팀노바포기사례\"를 본다");
						System.out.println("\"팀노바관련잡담\"을 본다");
						System.out.println("\"팀노바후기\"를 본다");
						System.out.println("\"팀노바소식\"을 본다");
						System.out.println("\"팀노바스타트업\"을 본다");
						System.out.println("\"팀노바대회소식\"을 본다");
						System.out.println("\"팀노바취업\"을 본다");
						System.out.println("\"팀노바질문답변\"을 본다");
						System.out.println("\"팀장과파트장이야기\"를 본다");
						System.out.println("\"IT업계\"를 본다");
						System.out.println("\"업계카운셀링\"을 본다");
						System.out.println("\"스타트업관련\"을 본다");
						System.out.println("\"기술소식\"을 본다");
						System.out.println("\"소프트웨어의 이해\"를 본다");
						System.out.println("\"컴퓨터공학과이야기\"를 본다");
						System.out.println("\"큐레이션\"를 본다");
						System.out.println("\"일상다반사\"를 본다");
						System.out.println("\"지름신\"을 본다");
						System.out.println("\"우리집 밤톨군\"을 본다");
						System.out.println("\"안드로이드\"를 본다");
						System.out.println("\"아이폰\"를 본다");
						System.out.println("\"MYSQL\"을 본다");
						System.out.println("\"PHP\"를 본다");
						System.out.println("\"PYTHON\"을 본다");
						System.out.println("\"Centos\"를 본다");
						System.out.println("\"개발기타\"를 본다");
						System.out.println("\"자바\"를 본다");
						System.out.println("\"드론\"을 본다");
						System.out.println("");
					} else if (Answer.equals("2")) {
						System.out.println("1. \"팀노바소개\"");
						System.out.println("2. \"팀노바 수강 신청 공지\"");
						System.out.println("3. \"팀노바 팀원공지\"");
						System.out.println("4. \"팀노바관련링크\"");
						System.out.println("5. \"팀노바풍경\"");
						System.out.println("6. \"팀노바팀원작품(기초)\"");
						System.out.println("7. \"팀노바팀원작품(응용)\"");
						System.out.println("8. \"팀노바수료자영상\"");
						System.out.println("9. \"팀노바포기사례\"");
						System.out.println("10. \"팀노바관련잡담\"");
						System.out.println("11. \"팀노바후기\"");
						System.out.println("12. \"팀노바소식\"");
						System.out.println("13. \"팀노바스타트업\"");
						System.out.println("14. \"팀노바대회소식\"");
						System.out.println("15. \"팀노바취업\"");
						System.out.println("16. \"팀노바질문답변\"");
						System.out.println("17. \"팀장과파트장이야기\"");
						System.out.println("18. \"IT업계\"");
						System.out.println("19. \"업계카운셀링\"");
						System.out.println("20. \"스타트업관련\"");
						System.out.println("21. \"기술소식\"");
						System.out.println("22. \"소프트웨어의 이해\"");
						System.out.println("23. \"컴퓨터공학과이야기\"");
						System.out.println("24. \"큐레이션\"");
						System.out.println("25. \"일상다반사\"");
						System.out.println("26. \"지름신\"");
						System.out.println("27. \"우리집 밤톨군\"");
						System.out.println("28. \"안드로이드\"");
						System.out.println("29. \"아이폰\"");
						System.out.println("30. \"MYSQL\"");
						System.out.println("31. \"PHP\"");
						System.out.println("32. \"PYTHON\"");
						System.out.println("33. \"Centos\"");
						System.out.println("34. \"개발기타\"");
						System.out.println("35. \"자바\"");
						System.out.println("36. \"드론\"");
						System.out.print("선택(1 ~ 36) : ");
						Answer = scan.next();
						scan.nextLine();
						System.out.println("");
						if (Answer.equals("1")) {
							System.out.println("\"팀노바소개\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("2")) {
							System.out.println("\"팀노바 수강 신청 공지\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("3")) {
							System.out.println("\"팀노바 팀원공지\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("4")) {
							System.out.println("\"팀노바관련링크\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("5")) {
							System.out.println("\"팀노바풍경\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("6")) {
							System.out.println("\"팀노바팀원작품(기초)\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("7")) {
							System.out.println("\"팀노바팀원작품(응용)\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("8")) {
							System.out.println("\"팀노바수료자영상\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("9")) {
							System.out.println("\"팀노바포기사례\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("10")) {
							System.out.println("\"팀노바관련잡담\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("11")) {
							System.out.println("\"팀노바후기\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("12")) {
							System.out.println("\"팀노바소식\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("13")) {
							System.out.println("\"팀노바스타트업\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("14")) {
							System.out.println("\"팀노바대회소식\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("15")) {
							System.out.println("\"팀노바취업\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("16")) {
							System.out.println("\"팀노바질문답변\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("17")) {
							System.out.println("\"팀장과파트장이야기\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("18")) {
							System.out.println("\"IT업계\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("19")) {
							System.out.println("\"팀노바대회소식\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("20")) {
							System.out.println("\"스타트업관련\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("21")) {
							System.out.println("\"기술소식\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("22")) {
							System.out.println("\"소프트웨어의 이해\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("23")) {
							System.out.println("\"컴퓨터공학과이야기\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("24")) {
							System.out.println("\"큐레이션\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("25")) {
							System.out.println("\"일상다반사\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("26")) {
							System.out.println("\"지름신\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("27")) {
							System.out.println("\"우리집 밤톨군\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("28")) {
							System.out.println("\"안드로이드\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("29")) {
							System.out.println("\"아이폰\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("30")) {
							System.out.println("\"MYSQL\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("31")) {
							System.out.println("\"PHP\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("32")) {
							System.out.println("\"PYTHON\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("33")) {
							System.out.println("\"Centos\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("34")) {
							System.out.println("\"개발기타\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("35")) {
							System.out.println("\"자바\"를 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						} else if (Answer.equals("36")) {
							System.out.println("\"드론\"을 본다");
							System.out.println("\"다른 목차도 보고 싶은대로본다");
						}
					}
				} else if (Answer.equals("2")) {
					System.out.println("1. 첫번째 페이지");
					System.out.println("2. 두번째 페이지");
					System.out.println("3. 세번째 페이지");
					System.out.println("4. 네번째 페이지");
					System.out.println("5. 다섯번째 페이지");
					System.out.println("6. 여섯번째 페이지");
					System.out.println("7. 일곱번째 페이지");
					System.out.println("8. 여덟번째 페이지");
					System.out.println("9. 아홉번째 페이지");
					System.out.println("10. 열번째 페이지 ");
					System.out.println("11. 열한번째 페이지");
					System.out.println("12. 보고 싶은대로");
					System.out.print("선택(1 ~ 12) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("1")) {
						System.out.println("첫번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("2")) {
						System.out.println("두번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("3")) {
						System.out.println("세번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("4")) {
						System.out.println("네번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("5")) {
						System.out.println("다섯번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("6")) {
						System.out.println("여섯번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("7")) {
						System.out.println("일곱번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("8")) {
						System.out.println("여덟번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("9")) {
						System.out.println("아홉번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("10")) {
						System.out.println("열번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("11")) {
						System.out.println("열한번째 페이지 글을 본다");
						System.out.println("다른 페이지 글도 본다");
					} else if (Answer.equals("12")) {
						System.out.println("아무거나 보고 싶은대로 본다");
						System.out.println("다른 글도 본다");
					}
				}
			}
			System.out.println("블로그를 충분히 둘러보았다");
			System.out.println("괜찮은 곳인지 생각해본다");
			System.out.println("다니고 싶은 곳인가 아닌가?");
			System.out.print("맞다(Y) 아니다(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("현실적으로 다닐 수 있는지 생각한다");
				System.out.println("비용은 충당 가능한가?");
				System.out.println("1. 적금으로 충당한다");
				System.out.println("2. 버는 돈으로 충당한다");
				System.out.println("3. 어떻게 해서든 다닌다");
				System.out.println("4. 충당 가능하지 않다");
				System.out.print("선택(1 ~ 4) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1") || Answer.equals("2") || Answer.equals("3")) {
					System.out.println("공부할 시간은 충분한가?");
					System.out.print("충분하다(Y) 충분하지 않다(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.println("가치에 대해 생각해본다");
						System.out.print("1년 동안 공부해서  얻을 수 있는 것이 내 인생에 도움이 될까?될거 같으면(Y), 아니면(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.println("청강을 듣는다");
							System.out.println("1. 기계인간 팀장님에게 바로 연락한다");
							System.out.println("2. 기계인간 팀장님에게 나중에 연락한다");
							System.out.print("선택(1 ~ 2) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("1") || Answer.equals("2")) {
								System.out.println("1. 문자로 청강신청을 한다");
								System.out.println("2. 전화로 청강신청을 한다");
								System.out.print("선택(1 ~ 2) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println("문자를 한다");
									System.out.println("청강일을 잡는다");
									System.out.println("1. 평일이 좋을 경우");
									System.out.println("2. 주말이 좋을 경우");
									System.out.print("선택(1 ~ 2) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("평일로 청강신청을 한다");
										System.out.print("기계인간 팀장님이 가능하다고 하면(Y), 아니면(N) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("Y") || Answer.equals("y")) 
										{
											System.out.println("평일로 청강신청을 확정한다");
											System.out.println("청강일자에 청강을 들으러 간다.");
											System.out.println("청강듣는 장소를 알아본다.");
											System.out.println("1. 1사무실");
											System.out.println("2. 2사무실");
											System.out.println("3. 3사무실");
											System.out.println("4. 4사무실");
											System.out.print("선택(1 ~ 4) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) 
											{
												office_1();
											} 
											else if (Answer.equals("2")) 
											{
												office_2();
											} 
											else if (Answer.equals("3")) 
											{
												office_3();
											} 
											else if (Answer.equals("4")) 
											{
												office_4();
											}
										} 
										else if (Answer.equals("N") || Answer.equals("n")) 
										{
											System.out.println("주말로 청강신청을 확정한다");
											System.out.println("청강일자에 청강을 들으러 간다.");
											System.out.println("청강듣는 장소를 알아본다.");
											System.out.println("1. 1사무실");
											System.out.println("2. 2사무실");
											System.out.println("3. 3사무실");
											System.out.println("4. 4사무실");
											System.out.print("선택(1 ~ 4) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												office_1();
											} else if (Answer.equals("2")) {
												office_2();
											} else if (Answer.equals("3")) {
												office_3();
											} else if (Answer.equals("4")) {
												office_4();
											}
										}
									} else if (Answer.equals("2")) {
										System.out.println("주말로 청강신청을 한다");
										System.out.print("기계인간 팀장님이 가능하다고 하면(Y), 아니면(N) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("Y") || Answer.equals("y")) {
											System.out.println("주말로 청강신청을 확정한다");
											System.out.println("청강일자에 청강을 들으러 간다.");
											System.out.println("청강듣는 장소를 알아본다.");
											System.out.println("1. 1사무실");
											System.out.println("2. 2사무실");
											System.out.println("3. 3사무실");
											System.out.println("4. 4사무실");
											System.out.print("선택(1 ~ 4) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												office_1();
											} else if (Answer.equals("2")) {
												office_2();
											} else if (Answer.equals("3")) {
												office_3();
											} else if (Answer.equals("4")) {
												office_4();
											}
										} else if (Answer.equals("N") || Answer.equals("n")) {
											System.out.println("평일로 청강신청을 확정한다");
											System.out.println("청강일자에 청강을 들으러 간다.");
											System.out.println("청강듣는 장소를 알아본다.");
											System.out.println("1. 1사무실");
											System.out.println("2. 2사무실");
											System.out.println("3. 3사무실");
											System.out.println("4. 4사무실");
											System.out.print("선택(1 ~ 4) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												office_1();
											} else if (Answer.equals("2")) {
												office_2();
											} else if (Answer.equals("3")) {
												office_3();
											} else if (Answer.equals("4")) {
												office_4();
											}
										}
									}
								} else if (Answer.equals("2")) {
									System.out.println("전화를 한다");
									System.out.println("청강일을 잡는다");
									System.out.println("전화를 끊는다");

									System.out.println("청강일자에 청강을 들으러 간다.");
									System.out.println("청강듣는 장소를 알아본다.");
									System.out.println("1. 1사무실");
									System.out.println("2. 2사무실");
									System.out.println("3. 3사무실");
									System.out.println("4. 4사무실");
									System.out.print("선택(1 ~ 4) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										office_1();
									} else if (Answer.equals("2")) {
										office_2();
									} else if (Answer.equals("3")) {
										office_3();
									} else if (Answer.equals("4")) {
										office_4();
									}
								}
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("다른 대안을 찾아본다");
							System.out.print("머신러닝에 대한 공부를 한다(Y), 안한다(N)");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("강의가 좋을지 책이좋을지 생각해본다.");
								System.out.println("1. 강의");
								System.out.println("2. 책");
								System.out.print("선택(1 ~ 2) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println("인터넷 강의를 찾아본다");
									System.out.print("모두를 위한 딥러닝을 듣는다(Y), 안듣는다(N) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("Y") || Answer.equals("y")) {
										System.out.println("1. 1강부터 듣는다");
										System.out.println("2. 필요한강의부터 듣는다.");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
									} else if (Answer.equals("N") || Answer.equals("n")) {
										System.out.println("다른 강의를 찾아본다");
										System.out.println("앤드류 응 교수의 머신러닝 강의를 듣는다(Y), (N)");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("Y") || Answer.equals("y")) {
											System.out.println("강의를 듣는다");
										} else if (Answer.equals("N") || Answer.equals("n")) {
											System.out.println("다른 강의를 찾아본다");
											System.out.println("다른 강의를 듣는다");
										}
									}
								} else if (Answer.equals("2")) {
									System.out.println("인터넷에서 책을 찾아본다");
									System.out.println("머신러닝 책을 읽는다");
								}
								System.out.println("머신러닝을 충분히 공부한다");
								System.out.println("논문구현까지 가능한 수준까지 끌어올린다");
								System.out.println("머신러닝관련 일자리를 구한다");
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("보안 개발쪽 일자리를 알아본다");
							}
						}
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("다른 교육을 찾아본다");
					}
				} else if (Answer.equals("4")) {
					System.out.println("다른 교육을 찾아본다");
				}
			} else if (Answer.equals("N") || Answer.equals("n")) {
				System.out.println("다른 교육을 찾아본다");
			}
		} else if (Answer.equals("N") || Answer.equals("n")) {
			System.out.println("스터디를 계속 한다");
			System.out.println("파이썬으로 침투 테스트용 TCP Proxy 만드는 법을 설명한다");
			System.out.println("1. 하나씩 다 자세히 설명한다");
			System.out.println("2. 소스만 설명한다");
			System.out.print("선택(1 ~ 2) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("1")) {
				System.out.println("프록시가 무엇인지 설명한다");
				System.out.println("TCP Proxy의 필요성에 대해 설명한다");
				System.out.println("TCP Proxy의 흐름에 대해 설명한다");
				System.out.println("TCP Proxy의 소스에 대해 설명한다");
				System.out.print("소스를 코딩한다. 완료되었으면(Y), 아직이면(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.print("빌드 및  실행한다. 성공했으면 (Y), 아니면(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.print("명령어를 입력하여 실행해 본다. 성공시 (Y), 아니면(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("어디가 잘못됐는지 확인한다.");
							System.out.println("오류를 수정하고 명령어를 입력하여 성공한다");
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						}
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("어디가 잘못됐는지 확인한다.");
						System.out.println("오류를 수정하고 빌드 및 실행하여 성공한다.");
						System.out.print("명령어를 입력하여 실행해 본다. 성공시 (Y), 아니면(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("어디가 잘못됐는지 확인한다.");
							System.out.println("오류를 수정하고 명령어를 입력하여 성공한다");
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						}
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("남은 코드를 코딩완료 한다.");

					System.out.print("빌드 및  실행한다. 성공했으면 (Y), 아니면(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.print("명령어를 입력하여 실행해 본다. 성공시 (Y), 아니면(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("어디가 잘못됐는지 확인한다.");
							System.out.println("오류를 수정하고 명령어를 입력하여 성공한다");
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						}
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("어디가 잘못됐는지 확인한다.");
						System.out.println("오류를 수정하고 빌드 및 실행하여 성공한다.");
						System.out.print("명령어를 입력하여 실행해 본다. 성공시 (Y), 아니면(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("어디가 잘못됐는지 확인한다.");
							System.out.println("오류를 수정하고 명령어를 입력하여 성공한다");
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						}
					}
				}
			} else if (Answer.equals("2")) {
				System.out.println("TCP Proxy의 소스에 대해 설명한다");
				System.out.print("소스를 코딩한다. 완료되었으면(Y), 아직이면(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.print("빌드 및  실행한다. 성공했으면 (Y), 아니면(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.print("명령어를 입력하여 실행해 본다. 성공시 (Y), 아니면(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("어디가 잘못됐는지 확인한다.");
							System.out.println("오류를 수정하고 명령어를 입력하여 성공한다");
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						}
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("어디가 잘못됐는지 확인한다.");
						System.out.println("오류를 수정하고 빌드 및 실행하여 성공한다.");
						System.out.print("명령어를 입력하여 실행해 본다. 성공시 (Y), 아니면(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("어디가 잘못됐는지 확인한다.");
							System.out.println("오류를 수정하고 명령어를 입력하여 성공한다");
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						}
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("남은 코드를 코딩완료 한다.");

					System.out.print("빌드 및  실행한다. 성공했으면 (Y), 아니면(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.print("명령어를 입력하여 실행해 본다. 성공시 (Y), 아니면(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("어디가 잘못됐는지 확인한다.");
							System.out.println("오류를 수정하고 명령어를 입력하여 성공한다");
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						}
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("어디가 잘못됐는지 확인한다.");
						System.out.println("오류를 수정하고 빌드 및 실행하여 성공한다.");
						System.out.print("명령어를 입력하여 실행해 본다. 성공시 (Y), 아니면(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("어디가 잘못됐는지 확인한다.");
							System.out.println("오류를 수정하고 명령어를 입력하여 성공한다");
							System.out.print("질문이 있는지 확인한다. 있으면(Y), 없으면(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("질문을 받는다.");
								System.out.println("질문에 대한 답변을 한다");
								System.out.println("추가 질문을 받는다. 있으면(Y), 없으면(N)");
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("추가 질문에 대한 답변을 한다.");
									System.out.println("스터디를 끝낸다.");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("스터디를 끝낸다.");
								}
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("스터디를 종료한다");
							}
						}
					}
				}
			} else {
				System.out.println("종료합니다.");
			}
		} else {
			System.out.println("종료합니다.");
		}
		scan.close();
	}

	public static void office_1() {
		String Answer;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 네이버 지도에서 1사무실 위치를 확인한다");
		System.out.println("2. 카카오맵에서 1사무실 위치를 확인한다");
		System.out.print("선택(1 ~ 2) : ");
		Answer = scan.next();
		scan.nextLine();
		if (Answer.equals("1")) {
			System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
			System.out.println("네이버지도에서 위치를 확인하였다");
			System.out.println("걸리는 시간을 확인하였다");
			System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
			System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
			System.out.println("1. 넉넉하게 청강시작시간 1시간 30분 전에 출발한다");
			System.out.println("2. 할일이 좀 있어서 청강시작시간 1시간 15분 전에 출발한다");
			System.out.print("선택(1 ~ 2) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("1")) {
				System.out.println("1. 지하철을 타고 이동한다");
				System.out.println("2. 버스를 타고 이동한다");
				System.out.println("3. 지하철과 버스를 타고 이동한다");
				System.out.print("선택(1 ~ 3) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1")) {
					Random random = new Random();
					int delay = random.nextInt(30) + 1;
					System.out.println("1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
					System.out.println("2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
					System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
					System.out.print("선택(1 ~ 3) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("1")) {
						if (delay > 15) {
							System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

						} else if (delay == 15) {
							System.out.println("사무실에 정시에 도착하였다");
						} else {
							System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
						}
					} else if (Answer.equals("2")) {
						if (delay > 15) {
							System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

						} else if (delay == 15) {
							System.out.println("사무실에 정시에 도착하였다");
						} else {
							System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
						}
					} else if (Answer.equals("3")) {
						System.out.println("사무실에 15분 전에 도착하였다");
					}
				}
			} else if (Answer.equals("2")) {
				Random random = new Random();
				int delay = random.nextInt(30) + 1;
				System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
				System.out.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
				System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
				System.out.print("선택(1 ~ 3) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1") || Answer.equals("2")) {
					System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
				} else if (Answer.equals("3")) {
					System.out.println("사무실에 정시에 도착하였다");
				}
			}
			System.out.println("사무실에서 청강을 한다");
			System.out.println("청강을 듣고 수업방식을 분석한다. 디테일하고 근거를 중시하며 참여도를 높이는 방식이지만 분위기가 다소 딱딱한 느낌도 있다");
			System.out.print("수업방식이 도움이 될 것 같으면(Y), 아니면(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("디테일과 근거를 중시, 참여하는 수업방식이 도움이 될 것 같다");
				System.out.print("청강을 듣고 학원을 다녀야겠다고 생각했다. 맞으면(Y), 아니면(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.println("기계인간팀장님에게 수강신청 전화를 한다");
					System.out.print("기계인간팀장님이 수강신청을 수락한다(Y), 거절한다(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.println("수강신청일을 기다린다");
						System.out.println("수강신청일이 되었다");
						System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.println("첫수업일까지 기다린다");
							System.out.println("첫수업일까지 준비할 것이 있는지 생각해본다");
							System.out.println("1. 머신러닝, 보안공부를 한다");
							System.out.println("2. 별도로 공부할 필요는 없을 것 같다");
							System.out.print("선택(1 ~ 2) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("1")) {
								System.out.println("첫 수업 시작전까지 머신러닝과 보안공부를 한다");
								System.out.println("수업시작 며칠전 첫 수업 및 수업장소 안내에 대한 문자를 받았다.");
								System.out.println("첫수업일이 되었다");
								System.out.println("수업장소를 확인한다");
								System.out.println("1. 1사무실");
								System.out.println("2. 2사무실");
								System.out.println("3. 3사무실");
								System.out.println("4. 4사무실");
								System.out.print("선택(1 ~ 4) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println("1. 네이버 지도에서 1사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 1사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								} else if (Answer.equals("2")) {
									System.out.println("1. 네이버 지도에서 2사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 2사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("3")) {

									System.out.println("1. 네이버 지도에서 3사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 3사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("4")) {
									System.out.println("1. 네이버 지도에서 4사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 4사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								}
							} else if (Answer.equals("2")) {
								System.out.println("별도로 공부하지 않는다. 수업전까지 논다");
								System.out.println("수업시작 며칠전 첫 수업 및 수업장소 안내에 대한 문자를 받았다.");
								System.out.println("첫수업일이 되었다");
								System.out.println("수업장소를 확인한다");
								System.out.println("1. 1사무실");
								System.out.println("2. 2사무실");
								System.out.println("3. 3사무실");
								System.out.println("4. 4사무실");
								System.out.print("선택(1 ~ 4) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println("1. 네이버 지도에서 1사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 1사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								} else if (Answer.equals("2")) {
									System.out.println("1. 네이버 지도에서 2사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 2사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("3")) {

									System.out.println("1. 네이버 지도에서 3사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 3사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("4")) {
									System.out.println("1. 네이버 지도에서 4사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 4사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								}
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("다음 수강신청일까지 기다린다");
							System.out.println("수강신청일이 되었다");
							System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("첫수업일까지 기다린다");
								System.out.println("첫수업일이 되었다");
								System.out.println("첫수업을 듣는다");
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("다음 수강신청일까지 기다린다");
								System.out.println("이번에도 신청못하면 의지가 약한것이다. 환불하자");
								System.out.println("수강신청일이 되었다");
								System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("첫수업일까지 기다린다");
									System.out.println("첫수업일이 되었다");
									System.out.println("첫수업을 듣는다");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("환불을 한다.");
								}
							}
						}
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("다른 교육을 찾아본다.");
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("다른 교육을 찾아본다");
				}
			} else if (Answer.equals("N") || Answer.equals("n")) {
				System.out.print("생각보다 딱딱한 분위기 인것 같다. 도움이 될 것 같지 않다");
				System.out.print("다른 교육을 찾아본다.");
			}
		} else if (Answer.equals("2")) {
			System.out.println("카카오맵에서 위치를 확인하였다");
			System.out.println("남성역 4번출구 KFC 건물 5층으로 간다");
			System.out.println("사무실에서 청강을 한다");
			System.out.print("청강을 듣고 학원을 다녀야겠다고 생각했다. 맞으면(Y), 아니면(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("기계인간팀장님에게 수강신청 전화를 한다");
				System.out.print("기계인간팀장님이 수강신청을 수락한다(Y), 거절한다(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.println("수강신청일을 기다린다");
					System.out.println("수강신청일이 되었다");
					System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.println("첫수업일까지 기다린다");
						System.out.println("첫수업일이 되었다");
						System.out.println("첫수업을 듣는다");
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("다음 수강신청일까지 기다린다");
						System.out.println("수강신청일이 되었다");
						System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.println("첫수업일까지 기다린다");
							System.out.println("첫수업일이 되었다");
							System.out.println("첫수업을 듣는다");
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("다음 수강신청일까지 기다린다");
							System.out.println("이번에도 신청못하면 의지가 약한것이다. 환불하자");
							System.out.println("수강신청일이 되었다");
							System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("첫수업일까지 기다린다");
								System.out.println("첫수업일이 되었다");
								System.out.println("첫수업을 듣는다");
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("환불을 한다.");
							}
						}
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("다른 교육을 찾아본다.");
				}
			} else if (Answer.equals("N") || Answer.equals("n")) {
				System.out.println("다른 대안을 찾아본다");
			}
		}
		scan.close();
	}

	public static void office_2() 
	{
		String Answer;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 네이버 지도에서 2사무실 위치를 확인한다");
		System.out.println("2. 카카오맵에서 2사무실 위치를 확인한다");
		System.out.print("선택(1 ~ 2) : ");
		Answer = scan.next();
		scan.nextLine();
		if (Answer.equals("1")) {
			System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
			System.out.println("네이버지도에서 위치를 확인하였다");
			System.out.println("걸리는 시간을 확인하였다");
			System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
			System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
			System.out.println("1. 넉넉하게 청강시작시간 1시간 30분 전에 출발한다");
			System.out.println("2. 할일이 좀 있어서 청강시작시간 1시간 15분 전에 출발한다");
			System.out.print("선택(1 ~ 2) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("1")) {
				System.out.println("1. 지하철을 타고 이동한다");
				System.out.println("2. 버스를 타고 이동한다");
				System.out.println("3. 지하철과 버스를 타고 이동한다");
				System.out.print("선택(1 ~ 3) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1")) {
					Random random = new Random();
					int delay = random.nextInt(30) + 1;
					System.out.println("1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
					System.out.println("2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
					System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
					System.out.print("선택(1 ~ 3) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("1")) {
						if (delay > 15) {
							System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

						} else if (delay == 15) {
							System.out.println("사무실에 정시에 도착하였다");
						} else {
							System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
						}
					} else if (Answer.equals("2")) {
						if (delay > 15) {
							System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

						} else if (delay == 15) {
							System.out.println("사무실에 정시에 도착하였다");
						} else {
							System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
						}
					} else if (Answer.equals("3")) {
						System.out.println("사무실에 15분 전에 도착하였다");
					}
				}
			} else if (Answer.equals("2")) {
				Random random = new Random();
				int delay = random.nextInt(30) + 1;
				System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
				System.out.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
				System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
				System.out.print("선택(1 ~ 3) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1") || Answer.equals("2")) {
					System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
				} else if (Answer.equals("3")) {
					System.out.println("사무실에 정시에 도착하였다");
				}
			}
			System.out.println("사무실에서 청강을 한다");
			System.out.println("청강을 듣고 수업방식을 분석한다. 디테일하고 근거를 중시하며 참여도를 높이는 방식이지만 분위기가 다소 딱딱한 느낌도 있다");
			System.out.print("수업방식이 도움이 될 것 같으면(Y), 아니면(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("디테일과 근거를 중시, 참여하는 수업방식이 도움이 될 것 같다");
				System.out.print("청강을 듣고 학원을 다녀야겠다고 생각했다. 맞으면(Y), 아니면(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.println("기계인간팀장님에게 수강신청 전화를 한다");
					System.out.print("기계인간팀장님이 수강신청을 수락한다(Y), 거절한다(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.println("수강신청일을 기다린다");
						System.out.println("수강신청일이 되었다");
						System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.println("첫수업일까지 기다린다");
							System.out.println("첫수업일까지 준비할 것이 있는지 생각해본다");
							System.out.println("1. 머신러닝, 보안공부를 한다");
							System.out.println("2. 별도로 공부할 필요는 없을 것 같다");
							System.out.print("선택(1 ~ 2) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("1")) {
								System.out.println("첫 수업 시작전까지 머신러닝과 보안공부를 한다");
								System.out.println("수업시작 며칠전 첫 수업 및 수업장소 안내에 대한 문자를 받았다.");
								System.out.println("첫수업일이 되었다");
								System.out.println("수업장소를 확인한다");
								System.out.println("1. 1사무실");
								System.out.println("2. 2사무실");
								System.out.println("3. 3사무실");
								System.out.println("4. 4사무실");
								System.out.print("선택(1 ~ 4) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println("1. 네이버 지도에서 1사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 1사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								} else if (Answer.equals("2")) {
									System.out.println("1. 네이버 지도에서 2사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 2사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("3")) {

									System.out.println("1. 네이버 지도에서 3사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 3사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("4")) {
									System.out.println("1. 네이버 지도에서 4사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 4사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								}
							} else if (Answer.equals("2")) {
								System.out.println("별도로 공부하지 않는다. 수업전까지 논다");
								System.out.println("수업시작 며칠전 첫 수업 및 수업장소 안내에 대한 문자를 받았다.");
								System.out.println("첫수업일이 되었다");
								System.out.println("수업장소를 확인한다");
								System.out.println("1. 1사무실");
								System.out.println("2. 2사무실");
								System.out.println("3. 3사무실");
								System.out.println("4. 4사무실");
								System.out.print("선택(1 ~ 4) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println("1. 네이버 지도에서 1사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 1사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								} else if (Answer.equals("2")) {
									System.out.println("1. 네이버 지도에서 2사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 2사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("3")) {

									System.out.println("1. 네이버 지도에서 3사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 3사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("4")) {
									System.out.println("1. 네이버 지도에서 4사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 4사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								}
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("다음 수강신청일까지 기다린다");
							System.out.println("수강신청일이 되었다");
							System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("첫수업일까지 기다린다");
								System.out.println("첫수업일이 되었다");
								System.out.println("첫수업을 듣는다");
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("다음 수강신청일까지 기다린다");
								System.out.println("이번에도 신청못하면 의지가 약한것이다. 환불하자");
								System.out.println("수강신청일이 되었다");
								System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("첫수업일까지 기다린다");
									System.out.println("첫수업일이 되었다");
									System.out.println("첫수업을 듣는다");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("환불을 한다.");
								}
							}
						}
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("다른 교육을 찾아본다.");
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("다른 교육을 찾아본다");
				}
			} else if (Answer.equals("N") || Answer.equals("n")) {
				System.out.print("생각보다 딱딱한 분위기 인것 같다. 도움이 될 것 같지 않다");
				System.out.print("다른 교육을 찾아본다.");
			}
		} else if (Answer.equals("2")) {
			System.out.println("카카오맵에서 위치를 확인하였다");
			System.out.println("남성역 4번출구 KFC 건물 5층으로 간다");
			System.out.println("사무실에서 청강을 한다");
			System.out.print("청강을 듣고 학원을 다녀야겠다고 생각했다. 맞으면(Y), 아니면(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("기계인간팀장님에게 수강신청 전화를 한다");
				System.out.print("기계인간팀장님이 수강신청을 수락한다(Y), 거절한다(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.println("수강신청일을 기다린다");
					System.out.println("수강신청일이 되었다");
					System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.println("첫수업일까지 기다린다");
						System.out.println("첫수업일이 되었다");
						System.out.println("첫수업을 듣는다");
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("다음 수강신청일까지 기다린다");
						System.out.println("수강신청일이 되었다");
						System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.println("첫수업일까지 기다린다");
							System.out.println("첫수업일이 되었다");
							System.out.println("첫수업을 듣는다");
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("다음 수강신청일까지 기다린다");
							System.out.println("이번에도 신청못하면 의지가 약한것이다. 환불하자");
							System.out.println("수강신청일이 되었다");
							System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("첫수업일까지 기다린다");
								System.out.println("첫수업일이 되었다");
								System.out.println("첫수업을 듣는다");
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("환불을 한다.");
							}
						}
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("다른 교육을 찾아본다.");
				}
			} else if (Answer.equals("N") || Answer.equals("n")) {
				System.out.println("다른 대안을 찾아본다");
			}
		}
		scan.close();
	}

	public static void office_3() 
	{
		String Answer;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 네이버 지도에서 3사무실 위치를 확인한다");
		System.out.println("2. 카카오맵에서 3사무실 위치를 확인한다");
		System.out.print("선택(1 ~ 2) : ");
		Answer = scan.next();
		scan.nextLine();
		if (Answer.equals("1")) {
			System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
			System.out.println("네이버지도에서 위치를 확인하였다");
			System.out.println("걸리는 시간을 확인하였다");
			System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
			System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
			System.out.println("1. 넉넉하게 청강시작시간 1시간 30분 전에 출발한다");
			System.out.println("2. 할일이 좀 있어서 청강시작시간 1시간 15분 전에 출발한다");
			System.out.print("선택(1 ~ 2) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("1")) {
				System.out.println("1. 지하철을 타고 이동한다");
				System.out.println("2. 버스를 타고 이동한다");
				System.out.println("3. 지하철과 버스를 타고 이동한다");
				System.out.print("선택(1 ~ 3) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1")) {
					Random random = new Random();
					int delay = random.nextInt(30) + 1;
					System.out.println("1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
					System.out.println("2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
					System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
					System.out.print("선택(1 ~ 3) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("1")) {
						if (delay > 15) {
							System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

						} else if (delay == 15) {
							System.out.println("사무실에 정시에 도착하였다");
						} else {
							System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
						}
					} else if (Answer.equals("2")) {
						if (delay > 15) {
							System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

						} else if (delay == 15) {
							System.out.println("사무실에 정시에 도착하였다");
						} else {
							System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
						}
					} else if (Answer.equals("3")) {
						System.out.println("사무실에 15분 전에 도착하였다");
					}
				}
			} else if (Answer.equals("2")) {
				Random random = new Random();
				int delay = random.nextInt(30) + 1;
				System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
				System.out.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
				System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
				System.out.print("선택(1 ~ 3) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1") || Answer.equals("2")) {
					System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
				} else if (Answer.equals("3")) {
					System.out.println("사무실에 정시에 도착하였다");
				}
			}
			System.out.println("사무실에서 청강을 한다");
			System.out.println("청강을 듣고 수업방식을 분석한다. 디테일하고 근거를 중시하며 참여도를 높이는 방식이지만 분위기가 다소 딱딱한 느낌도 있다");
			System.out.print("수업방식이 도움이 될 것 같으면(Y), 아니면(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("디테일과 근거를 중시, 참여하는 수업방식이 도움이 될 것 같다");
				System.out.print("청강을 듣고 학원을 다녀야겠다고 생각했다. 맞으면(Y), 아니면(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.println("기계인간팀장님에게 수강신청 전화를 한다");
					System.out.print("기계인간팀장님이 수강신청을 수락한다(Y), 거절한다(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.println("수강신청일을 기다린다");
						System.out.println("수강신청일이 되었다");
						System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.println("첫수업일까지 기다린다");
							System.out.println("첫수업일까지 준비할 것이 있는지 생각해본다");
							System.out.println("1. 머신러닝, 보안공부를 한다");
							System.out.println("2. 별도로 공부할 필요는 없을 것 같다");
							System.out.print("선택(1 ~ 2) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("1")) {
								System.out.println("첫 수업 시작전까지 머신러닝과 보안공부를 한다");
								System.out.println("수업시작 며칠전 첫 수업 및 수업장소 안내에 대한 문자를 받았다.");
								System.out.println("첫수업일이 되었다");
								System.out.println("수업장소를 확인한다");
								System.out.println("1. 1사무실");
								System.out.println("2. 2사무실");
								System.out.println("3. 3사무실");
								System.out.println("4. 4사무실");
								System.out.print("선택(1 ~ 4) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println("1. 네이버 지도에서 1사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 1사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								} else if (Answer.equals("2")) {
									System.out.println("1. 네이버 지도에서 2사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 2사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("3")) {

									System.out.println("1. 네이버 지도에서 3사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 3사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("4")) {
									System.out.println("1. 네이버 지도에서 4사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 4사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								}
							} else if (Answer.equals("2")) {
								System.out.println("별도로 공부하지 않는다. 수업전까지 논다");
								System.out.println("수업시작 며칠전 첫 수업 및 수업장소 안내에 대한 문자를 받았다.");
								System.out.println("첫수업일이 되었다");
								System.out.println("수업장소를 확인한다");
								System.out.println("1. 1사무실");
								System.out.println("2. 2사무실");
								System.out.println("3. 3사무실");
								System.out.println("4. 4사무실");
								System.out.print("선택(1 ~ 4) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println("1. 네이버 지도에서 1사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 1사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								} else if (Answer.equals("2")) {
									System.out.println("1. 네이버 지도에서 2사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 2사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("3")) {

									System.out.println("1. 네이버 지도에서 3사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 3사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("4")) {
									System.out.println("1. 네이버 지도에서 4사무실 위치를 확인한다");
									System.out.println("2. 카카오맵에서 4사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println("1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println("2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out.println("1. 지하철을 타고 이동한다");
											System.out.println("2. 버스를 타고 이동한다");
											System.out.println("3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30) + 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
												System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out.println("사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println("사무실에 정시에 도착하였다");
													} else {
														System.out.println("사무실에" + (15 - delay) + "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println("사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println("1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out
													.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay + "분이 지연되어 남성역에 도착하였다");
											System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1") || Answer.equals("2")) {
												System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println("사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								}
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("다음 수강신청일까지 기다린다");
							System.out.println("수강신청일이 되었다");
							System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("첫수업일까지 기다린다");
								System.out.println("첫수업일이 되었다");
								System.out.println("첫수업을 듣는다");
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("다음 수강신청일까지 기다린다");
								System.out.println("이번에도 신청못하면 의지가 약한것이다. 환불하자");
								System.out.println("수강신청일이 되었다");
								System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("첫수업일까지 기다린다");
									System.out.println("첫수업일이 되었다");
									System.out.println("첫수업을 듣는다");
								} else if (Answer.equals("N") || Answer.equals("n")) {
									System.out.println("환불을 한다.");
								}
							}
						}
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("다른 교육을 찾아본다.");
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("다른 교육을 찾아본다");
				}
			} else if (Answer.equals("N") || Answer.equals("n")) {
				System.out.print("생각보다 딱딱한 분위기 인것 같다. 도움이 될 것 같지 않다");
				System.out.print("다른 교육을 찾아본다.");
			}
		} else if (Answer.equals("2")) {
			System.out.println("카카오맵에서 위치를 확인하였다");
			System.out.println("남성역 4번출구 KFC 건물 5층으로 간다");
			System.out.println("사무실에서 청강을 한다");
			System.out.print("청강을 듣고 학원을 다녀야겠다고 생각했다. 맞으면(Y), 아니면(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("기계인간팀장님에게 수강신청 전화를 한다");
				System.out.print("기계인간팀장님이 수강신청을 수락한다(Y), 거절한다(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.println("수강신청일을 기다린다");
					System.out.println("수강신청일이 되었다");
					System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.println("첫수업일까지 기다린다");
						System.out.println("첫수업일이 되었다");
						System.out.println("첫수업을 듣는다");
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("다음 수강신청일까지 기다린다");
						System.out.println("수강신청일이 되었다");
						System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.println("첫수업일까지 기다린다");
							System.out.println("첫수업일이 되었다");
							System.out.println("첫수업을 듣는다");
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("다음 수강신청일까지 기다린다");
							System.out.println("이번에도 신청못하면 의지가 약한것이다. 환불하자");
							System.out.println("수강신청일이 되었다");
							System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("첫수업일까지 기다린다");
								System.out.println("첫수업일이 되었다");
								System.out.println("첫수업을 듣는다");
							} else if (Answer.equals("N") || Answer.equals("n")) {
								System.out.println("환불을 한다.");
							}
						}
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("다른 교육을 찾아본다.");
				}
			} else if (Answer.equals("N") || Answer.equals("n")) {
				System.out.println("다른 대안을 찾아본다");
			}
		}
		scan.close();
	}

	public static void office_4() 
	{
		String Answer;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 네이버 지도에서 4사무실 위치를 확인한다");
		System.out.println("2. 카카오맵에서 4사무실 위치를 확인한다");
		System.out.print("선택(1 ~ 2) : ");
		Answer = scan.next();
		scan.nextLine();
		if (Answer.equals("1")) {
			System.out.println("블로그에 확인시 동작구 사당동 708-429 4층이다");
			System.out.println("네이버지도에서 위치를 확인하였다");
			System.out.println("걸리는 시간을 확인하였다");
			System.out.println("집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
			System.out.println("집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
			System.out.println("1. 넉넉하게 청강시작시간 1시간 30분 전에 출발한다");
			System.out.println("2. 할일이 좀 있어서 청강시작시간 1시간 15분 전에 출발한다");
			System.out.print("선택(1 ~ 2) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("1")) {
				System.out.println("1. 지하철을 타고 이동한다");
				System.out.println("2. 버스를 타고 이동한다");
				System.out.println("3. 지하철과 버스를 타고 이동한다");
				System.out.print("선택(1 ~ 3) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1")) {
					Random random = new Random();
					int delay = random.nextInt(30) + 1;
					System.out.println("1. 지하철을 타고 이동 중 연착이 되어" + delay
							+ "분이 지연되어 남성역에 도착하였다");
					System.out.println("2. 지하철을 타고 이동 중 환승열차를 놓쳐" + delay
							+ "분이 지연되어 남성역에 도착하였다");
					System.out.println("3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
					System.out.print("선택(1 ~ 3) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("1")) {
						if (delay > 15) {
							System.out.println(
									"사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

						} else if (delay == 15) {
							System.out.println("사무실에 정시에 도착하였다");
						} else {
							System.out.println(
									"사무실에" + (15 - delay) + "분 전에 도착하였다");
						}
					} else if (Answer.equals("2")) {
						if (delay > 15) {
							System.out.println(
									"사무실에" + (delay - 15) + "분 만큼 늦게 도착하였다");

						} else if (delay == 15) {
							System.out.println("사무실에 정시에 도착하였다");
						} else {
							System.out.println(
									"사무실에" + (15 - delay) + "분 전에 도착하였다");
						}
					} else if (Answer.equals("3")) {
						System.out.println("사무실에 15분 전에 도착하였다");
					}
				}
			} else if (Answer.equals("2")) {
				Random random = new Random();
				int delay = random.nextInt(30) + 1;
				System.out.println(
						"1. 버스를 타고 이동 중 길이 막혀" + delay + "분이 지연되어 남성역에 도착하였다");
				System.out.println("2. 버스를 타고 이동 중 환승버스를 놓쳐" + delay
						+ "분이 지연되어 남성역에 도착하였다");
				System.out.println("3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
				System.out.print("선택(1 ~ 3) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("1") || Answer.equals("2")) {
					System.out.println("사무실에" + delay + "분 만큼 늦게 도착하였다");
				} else if (Answer.equals("3")) {
					System.out.println("사무실에 정시에 도착하였다");
				}
			}
			System.out.println("사무실에서 청강을 한다");
			System.out.println(
					"청강을 듣고 수업방식을 분석한다. 디테일하고 근거를 중시하며 참여도를 높이는 방식이지만 분위기가 다소 딱딱한 느낌도 있다");
			System.out.print("수업방식이 도움이 될 것 같으면(Y), 아니면(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("디테일과 근거를 중시, 참여하는 수업방식이 도움이 될 것 같다");
				System.out.print("청강을 듣고 학원을 다녀야겠다고 생각했다. 맞으면(Y), 아니면(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.println("기계인간팀장님에게 수강신청 전화를 한다");
					System.out.print("기계인간팀장님이 수강신청을 수락한다(Y), 거절한다(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.println("수강신청일을 기다린다");
						System.out.println("수강신청일이 되었다");
						System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.println("첫수업일까지 기다린다");
							System.out.println("첫수업일까지 준비할 것이 있는지 생각해본다");
							System.out.println("1. 머신러닝, 보안공부를 한다");
							System.out.println("2. 별도로 공부할 필요는 없을 것 같다");
							System.out.print("선택(1 ~ 2) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("1")) {
								System.out.println("첫 수업 시작전까지 머신러닝과 보안공부를 한다");
								System.out.println(
										"수업시작 며칠전 첫 수업 및 수업장소 안내에 대한 문자를 받았다.");
								System.out.println("첫수업일이 되었다");
								System.out.println("수업장소를 확인한다");
								System.out.println("1. 1사무실");
								System.out.println("2. 2사무실");
								System.out.println("3. 3사무실");
								System.out.println("4. 4사무실");
								System.out.print("선택(1 ~ 4) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println(
											"1. 네이버 지도에서 1사무실 위치를 확인한다");
									System.out
											.println("2. 카카오맵에서 1사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println(
												"블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println(
												"블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								} else if (Answer.equals("2")) {
									System.out.println(
											"1. 네이버 지도에서 2사무실 위치를 확인한다");
									System.out
											.println("2. 카카오맵에서 2사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println(
												"블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println(
												"블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("3")) {

									System.out.println(
											"1. 네이버 지도에서 3사무실 위치를 확인한다");
									System.out
											.println("2. 카카오맵에서 3사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println(
												"블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println(
												"블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("4")) {
									System.out.println(
											"1. 네이버 지도에서 4사무실 위치를 확인한다");
									System.out
											.println("2. 카카오맵에서 4사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println(
												"블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println(
												"블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								}
							} else if (Answer.equals("2")) {
								System.out.println("별도로 공부하지 않는다. 수업전까지 논다");
								System.out.println(
										"수업시작 며칠전 첫 수업 및 수업장소 안내에 대한 문자를 받았다.");
								System.out.println("첫수업일이 되었다");
								System.out.println("수업장소를 확인한다");
								System.out.println("1. 1사무실");
								System.out.println("2. 2사무실");
								System.out.println("3. 3사무실");
								System.out.println("4. 4사무실");
								System.out.print("선택(1 ~ 4) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("1")) {
									System.out.println(
											"1. 네이버 지도에서 1사무실 위치를 확인한다");
									System.out
											.println("2. 카카오맵에서 1사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println(
												"블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println(
												"블로그에 확인시 남성역 4번출구 KFC 건물 5층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								} else if (Answer.equals("2")) {
									System.out.println(
											"1. 네이버 지도에서 2사무실 위치를 확인한다");
									System.out
											.println("2. 카카오맵에서 2사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println(
												"블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println(
												"블로그에 확인시 남성역 1번출구 올레kt 매장 건물 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("3")) {

									System.out.println(
											"1. 네이버 지도에서 3사무실 위치를 확인한다");
									System.out
											.println("2. 카카오맵에서 3사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println(
												"블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println(
												"블로그에 확인시 동작구 사당동 708-429 2층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}

								} else if (Answer.equals("4")) {
									System.out.println(
											"1. 네이버 지도에서 4사무실 위치를 확인한다");
									System.out
											.println("2. 카카오맵에서 4사무실 위치를 확인한다");
									System.out.println("3. 이미 위치를 알고 있다.");
									System.out.print("선택(1 ~ 3) : ");
									Answer = scan.next();
									scan.nextLine();
									if (Answer.equals("1")) {
										System.out.println(
												"블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("네이버지도에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									} else if (Answer.equals("2")) {
										System.out.println(
												"블로그에 확인시 동작구 사당동 708-429 4층이다");
										System.out.println("카카오맵에서 위치를 확인하였다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");

									} else if (Answer.equals("3")) {
										System.out.println("사무실 위치는 알고 있다");
										System.out.println("걸리는 시간을 확인하였다");
										System.out.println(
												"집에서부터 걸리는 시간은 넉넉잡아 1시간30분이다");
										System.out.println(
												"집에서부터 걸리는 시간은 타이트하게 1시간15분이다");
										System.out.println(
												"1. 넉넉하게 수업시작시간 1시간 30분 전에 출발한다");
										System.out.println(
												"2. 할일이 좀 있어서 수업시작시간 1시간 15분 전에 출발한다");
										System.out.print("선택(1 ~ 2) : ");
										Answer = scan.next();
										scan.nextLine();
										if (Answer.equals("1")) {
											System.out
													.println("1. 지하철을 타고 이동한다");
											System.out
													.println("2. 버스를 타고 이동한다");
											System.out.println(
													"3. 지하철과 버스를 타고 이동한다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")) {
												Random random = new Random();
												int delay = random.nextInt(30)
														+ 1;
												System.out.println(
														"1. 지하철을 타고 이동 중 연착이 되어"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"2. 지하철을 타고 이동 중 환승열차를 놓쳐"
																+ delay
																+ "분이 지연되어 남성역에 도착하였다");
												System.out.println(
														"3. 지하철을 타고 시간에 맞춰 남성역까지 도착하였다");
												System.out
														.print("선택(1 ~ 3) : ");
												Answer = scan.next();
												scan.nextLine();
												if (Answer.equals("1")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("2")) {
													if (delay > 15) {
														System.out
																.println("사무실에"
																		+ (delay - 15)
																		+ "분 만큼 늦게 도착하였다");

													} else if (delay == 15) {
														System.out.println(
																"사무실에 정시에 도착하였다");
													} else {
														System.out
																.println("사무실에"
																		+ (15 - delay)
																		+ "분 전에 도착하였다");
													}
												} else if (Answer.equals("3")) {
													System.out.println(
															"사무실에 15분 전에 도착하였다");
												}
											}
										} else if (Answer.equals("2")) {
											Random random = new Random();
											int delay = random.nextInt(30) + 1;
											System.out.println(
													"1. 버스를 타고 이동 중 길이 막혀"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"2. 버스를 타고 이동 중 환승버스를 놓쳐"
															+ delay
															+ "분이 지연되어 남성역에 도착하였다");
											System.out.println(
													"3. 버스를 타고 시간에 맞춰 남성역까지 도착하였다");
											System.out.print("선택(1 ~ 3) : ");
											Answer = scan.next();
											scan.nextLine();
											if (Answer.equals("1")
													|| Answer.equals("2")) {
												System.out.println("사무실에"
														+ delay
														+ "분 만큼 늦게 도착하였다");
											} else if (Answer.equals("3")) {
												System.out.println(
														"사무실에 정시에 도착하였다");
											}
										}
										System.out.println("첫수업을 듣는다");
									}
								}
							}
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("다음 수강신청일까지 기다린다");
							System.out.println("수강신청일이 되었다");
							System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("첫수업일까지 기다린다");
								System.out.println("첫수업일이 되었다");
								System.out.println("첫수업을 듣는다");
							} else if (Answer.equals("N")
									|| Answer.equals("n")) {
								System.out.println("다음 수강신청일까지 기다린다");
								System.out
										.println("이번에도 신청못하면 의지가 약한것이다. 환불하자");
								System.out.println("수강신청일이 되었다");
								System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
								Answer = scan.next();
								scan.nextLine();
								if (Answer.equals("Y") || Answer.equals("y")) {
									System.out.println("첫수업일까지 기다린다");
									System.out.println("첫수업일이 되었다");
									System.out.println("첫수업을 듣는다");
								} else if (Answer.equals("N")
										|| Answer.equals("n")) {
									System.out.println("환불을 한다.");
								}
							}
						}
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("다른 교육을 찾아본다.");
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("다른 교육을 찾아본다");
				}
			} else if (Answer.equals("N") || Answer.equals("n")) {
				System.out.print("생각보다 딱딱한 분위기 인것 같다. 도움이 될 것 같지 않다");
				System.out.print("다른 교육을 찾아본다.");
			}
		} else if (Answer.equals("2")) {
			System.out.println("카카오맵에서 위치를 확인하였다");
			System.out.println("남성역 4번출구 KFC 건물 5층으로 간다");
			System.out.println("사무실에서 청강을 한다");
			System.out.print("청강을 듣고 학원을 다녀야겠다고 생각했다. 맞으면(Y), 아니면(N) : ");
			Answer = scan.next();
			scan.nextLine();
			if (Answer.equals("Y") || Answer.equals("y")) {
				System.out.println("기계인간팀장님에게 수강신청 전화를 한다");
				System.out.print("기계인간팀장님이 수강신청을 수락한다(Y), 거절한다(N) : ");
				Answer = scan.next();
				scan.nextLine();
				if (Answer.equals("Y") || Answer.equals("y")) {
					System.out.println("수강신청일을 기다린다");
					System.out.println("수강신청일이 되었다");
					System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
					Answer = scan.next();
					scan.nextLine();
					if (Answer.equals("Y") || Answer.equals("y")) {
						System.out.println("첫수업일까지 기다린다");
						System.out.println("첫수업일이 되었다");
						System.out.println("첫수업을 듣는다");
					} else if (Answer.equals("N") || Answer.equals("n")) {
						System.out.println("다음 수강신청일까지 기다린다");
						System.out.println("수강신청일이 되었다");
						System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
						Answer = scan.next();
						scan.nextLine();
						if (Answer.equals("Y") || Answer.equals("y")) {
							System.out.println("첫수업일까지 기다린다");
							System.out.println("첫수업일이 되었다");
							System.out.println("첫수업을 듣는다");
						} else if (Answer.equals("N") || Answer.equals("n")) {
							System.out.println("다음 수강신청일까지 기다린다");
							System.out.println("이번에도 신청못하면 의지가 약한것이다. 환불하자");
							System.out.println("수강신청일이 되었다");
							System.out.print("수강신청을 하였다(Y), 하지못했다(N) : ");
							Answer = scan.next();
							scan.nextLine();
							if (Answer.equals("Y") || Answer.equals("y")) {
								System.out.println("첫수업일까지 기다린다");
								System.out.println("첫수업일이 되었다");
								System.out.println("첫수업을 듣는다");
							} else if (Answer.equals("N")
									|| Answer.equals("n")) {
								System.out.println("환불을 한다.");
							}
						}
					}
				} else if (Answer.equals("N") || Answer.equals("n")) {
					System.out.println("다른 교육을 찾아본다.");
				}
			} else if (Answer.equals("N") || Answer.equals("n")) {
				System.out.println("다른 교육을 찾아본다");
			}
		}
		scan.close();
	}
	
}

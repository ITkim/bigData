package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controller;
import model.Hospital_PeopleDAO;
import model.Hospital_TotalDAO;
import model.domain.Hospital_PeopleDTO;
import model.domain.Hospital_TotalDTO;

public class StartView3 {
	public static void main(String[] args) {
		// 賅萇 匐儀
		Controller controller = Controller.getInstance();
		
		Scanner scan = new Scanner(System.in);
		int result = 0;
		String resultLoc = null;
		
		while (result != 10) {
			System.out.println("***********詭景***********");
			System.out.println("  1 - 雖羲 滌 煽錳 瞪羹 爾晦");
			System.out.println("  2 - 雖羲 滌 曖猿檣溘熱 瞪羹 爾晦  ");
			System.out.println("  3 - 雖羲 滌 煽錳 匐儀 ");
			System.out.println("  4 - 雖羲 滌 曖猿檣溘 熱 匐儀");
			System.out.println("  5 - 雖羲 滌 煽錳 塽 曖猿檣溘 熱 匐儀 ");
			System.out.println("  9 - 婦葬濠 賅萄 ");
			System.out.println("  10 - Щ煎斜極擊 謙猿 ж晦");
			System.out.println();
			System.out.print(" 詭景蒂 摹鷗ж撮蹂 :  ");
		
			result = scan.nextInt();
			
		
			
			switch (result) {
			case 0:
				System.out.println("殮溘高 螃盟殮棲棻");
				break;
			case 1:

				System.out.println("*********** 煎馨檜暮 滌 煽錳 瞪羹 爾晦 **************");
				System.out.println();
				System.out.println();
				System.out.println(
						" 天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天");
				controller.getTotalAll();
				System.out.println(
						" 天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天");

				break;
			// 匐儀 - id 煎 匐儀
			case 2:
				System.out.println("*********** 煎馨檜暮 滌 曖猿檣溘熱 瞪羹 爾晦 **************");
				System.out.println();
				System.out.println();
				System.out.println(
						" 天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天");
				controller.getPeopleAll();
				System.out.println(
						"天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天");

				break;

			case 3:

				// 煎馨檜暮 滌 煽錳 匐儀
				while (result != 0) {
					System.out.println("*** 煎馨檜暮 滌 煽錳 匐儀擊 ж衛啊蝗棲梱? 1(yes) / 0(no) ");
					try {
						result = scan.nextInt();
					} catch (Exception e) {
						System.out.println("璋濠蒂 殮溘ж撮蹂");
						// e.printStackTrace();
						result=100;
					}

				
				int result2 = 10;
				if (result == 0 || result2 == 0) {
					break;
				}
				while (result2 != 0) {
					System.out.println("*** " + "瓊堅濠 ж朝 煽錳擊 堅腦衛螃 ");
					System.out.println("1)謙м煽錳   2)煽錳   3)纂婁   4)и曖錳/и寞煽錳   5)褻骯錳   6)蹂曄/喻檣瞪僥煽錳   "
							+ "7)唸р煽錳   8)薑褐煽錳   0)菴煎 給嬴陛晦");
					result2 = scan.nextInt();
					
					System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
					// e.printStackTrace();
					result=100;
					switch (result2) {

					case 1:
						System.out.println("***謙м煽錳曖 熱***");
						try {
							for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
								System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "雖羲曖" + " 謙м煽錳曖 熱:"
										+ Hospital_TotalDAO.getAll().get(i).getGnr_Hospital() + " | 謙м煽錳 煽鼻 熱 :"
										+ Hospital_TotalDAO.getAll().get(i).getGnr_Bed());
								Thread.sleep(300);
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
							// e.printStackTrace();
							result=100;
						break;

					case 2:
						System.out.println("***煽錳曖 熱***");
						try {
							for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
								System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "雖羲曖" + " 煽錳曖 熱:"
										+ Hospital_TotalDAO.getAll().get(i).getHospital() + " |煽錳 煽鼻 熱: "
										+ Hospital_TotalDAO.getAll().get(i).getH_Bed());
								Thread.sleep(300);
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							// e.printStackTrace();
							result=100;
						break;

					case 3:
						System.out.println("***纂婁曖 熱***");
						try {
							for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
								System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "雖羲曖" + " 纂婁曖 熱:"
										+ Hospital_TotalDAO.getAll().get(i).getDent_Hospital() + " | 纂婁 煽鼻 熱: "
										+ +Hospital_TotalDAO.getAll().get(i).getDent_Bed() + " | 纂婁曖錳 熱"
										+ Hospital_TotalDAO.getAll().get(i).getDent_Clinic_Hospital() + " | 纂婁曖錳 煽鼻 熱"
										+ Hospital_TotalDAO.getAll().get(i).getDent_Clinic_Bed());
								Thread.sleep(300);
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							// e.printStackTrace();
							result=100;
						break;

					case 4:
						System.out.println("***и曖錳/и寞煽錳曖 熱***");
						try {
							for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
								System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "雖羲曖" + " и曖錳曖 熱:"
										+ Hospital_TotalDAO.getAll().get(i).getHerb_Hospital() + " | и曖錳 煽鼻 熱: "
										+ +Hospital_TotalDAO.getAll().get(i).getHerb_Bed() + " | 纂婁曖錳 熱"
										+ Hospital_TotalDAO.getAll().get(i).getHerb_Clinic_Hospital() + " | 纂婁曖錳 煽鼻 熱"
										+ Hospital_TotalDAO.getAll().get(i).getHerb_Clinic_Bed());
								Thread.sleep(300);
							}
						} catch (Exception e) {
							System.out.println("璋濠蒂 殮溘ж撮蹂");
							// e.printStackTrace();
							result=100;
						}
						break;

					case 5:
						System.out.println("***褻骯錳曖 熱***");
						try {
							for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
								System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "雖羲曖" + " 褻骯錳曖 熱:"
										+ Hospital_TotalDAO.getAll().get(i).getMaternity_Hospital() + " | 褻骯錳 煽鼻 熱 :"
										+ Hospital_TotalDAO.getAll().get(i).getMaternity_Bed());
								Thread.sleep(300);
							}
						} catch (Exception e) {
							System.out.println("璋濠蒂 殮溘ж撮蹂");
							// e.printStackTrace();
							result=100;
						}
						break;

					case 6:
						System.out.println("***蹂曄/喻檣瞪僥煽錳曖 熱***");
						try {
							for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
								System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "雖羲曖" + " 蹂曄 煽錳曖 熱:"
										+ Hospital_TotalDAO.getAll().get(i).getSnr_Hospital() + " | 蹂曄 煽錳曖 煽鼻 熱: "
										+ +Hospital_TotalDAO.getAll().get(i).getSnr_Bed() + " | 喻檣 煽錳曖 熱"
										+ Hospital_TotalDAO.getAll().get(i).getAff_Hospital() + " | 喻檣煽錳曖 煽鼻 熱"
										+ Hospital_TotalDAO.getAll().get(i).getAff_Bed());
								Thread.sleep(300);
							}
						} catch (Exception e) {
							System.out.println("璋濠蒂 殮溘ж撮蹂");
							// e.printStackTrace();
							result=100;
						}
						break;

					case 7:
						System.out.println("***唸р煽錳曖 熱***");
						try {
							for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
								System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "雖羲曖" + " 唸р煽錳曖 熱:"
										+ Hospital_TotalDAO.getAll().get(i).getTub_Hospital() + " | 唸р煽錳 煽鼻 熱 :"
										+ Hospital_TotalDAO.getAll().get(i).getTub_Bed());
								Thread.sleep(300);
							}
						} catch (Exception e) {
							System.out.println("璋濠蒂 殮溘ж撮蹂");
							// e.printStackTrace();
							result=100;
						}
						break;

					case 8:
						System.out.println("***薑褐煽錳曖 熱***");
						try {
							for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
								System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "雖羲曖" + " 薑褐煽錳曖 熱:"
										+ Hospital_TotalDAO.getAll().get(i).getMental_hospital() + " | 薑褐煽錳 煽鼻 熱 :"
										+ Hospital_TotalDAO.getAll().get(i).getMental_Bed());
								Thread.sleep(300);
							}
						} catch (Exception e) {
							System.out.println("璋濠蒂 殮溘ж撮蹂");
							// e.printStackTrace();
							result=100;
						}
						break;

					case 0:
						System.out.println("*** 蟾晦 詭景煎 檜翕***");
						break;

					}
				}
				}
				break;

			// 煎馨檜暮 滌 曖猿檣溘
			case 4:

				while (result != 0) {
					System.out.println("*** 煎馨檜暮 滌 曖猿檣溘擊 爾衛啊蝗棲梱? 1(yes) /0(no) ");
					try {
					result = scan.nextInt();
					} catch (Exception e) {
						System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
						// e.printStackTrace();
						result=100;
					}
					if (result == 0) {
						break;
					}
					try {
						for (int i = 0; i < Hospital_PeopleDAO.getAll().size(); i++) {
							System.out.println((i + 1) + " " + Hospital_PeopleDAO.getAll().get(i).getLoc());
						}
						while (result != 0) {
							System.out.print("*** 爾堅 談擎  雖羲曖 璋濠蒂 殮溘 ж撮蹂(0擎 謙猿) :  ");
							try {
							result = scan.nextInt();
							} catch (Exception e) {
								System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
								// e.printStackTrace();
								result=100;
							}
							if (result == 0) {
								break;
							}
							try {
								System.out.println(Hospital_PeopleDAO.getAll().get(result - 1));
							} catch (Exception e) {
								System.out.println("璋濠蒂 殮溘ж撮蹂");
								// e.printStackTrace();
								result=100;
							}

						}
					} catch (Exception e) {
						System.out.println("璋濠蒂 殮溘ж撮蹂");
						// e.printStackTrace();
						result=100;
					}

				}

				break;

			// 雖羲 滌 煽錳 塽 曖猿檣溘 熱 匐儀
			case 5:
				while (result != 0) {
					System.out.println("*** 雖羲 滌 煽錳 塽 曖猿檣溘 熱 匐儀擊 ж衛啊蝗棲梱? 1(yes) /0(no) ");
					try {
					result = scan.nextInt();
					} catch (Exception e) {
						System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
						// e.printStackTrace();
						result=100;
					}
					if (result == 0) {
						break;
					} else if (result == 1) {
						try {
							for (int i = 0; i < Hospital_PeopleDAO.getAll().size(); i++) {
								System.out.println((i + 1) + " " + Hospital_PeopleDAO.getAll().get(i).getLoc());
							}
							while (result != 0) {
								System.out.print("*** 爾堅 談擎  雖羲曖 璋濠蒂 殮溘 ж撮蹂(0擎 謙猿) :  ");
								try {
								result = scan.nextInt();
								} catch (Exception e) {
									System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
									// e.printStackTrace();
									result=100;
								}
								if (result == 0) {
									break;
								}
								try {
									System.out.println(Hospital_PeopleDAO.getAll().get(result - 1));
									System.out.println(Hospital_TotalDAO.getAll().get(result - 1));

								} catch (Exception e) {
									System.out.println("璋濠蒂 殮溘ж撮蹂");
									// e.printStackTrace();
									result=100;
								}

							}
						} catch (Exception e) {
							System.out.println("璋濠蒂 殮溘ж撮蹂");
							// e.printStackTrace();
							result=100;
						}
					} else {
						System.out.println("澀跤 脹 殮溘 殮棲棻. 棻衛 殮溘ж撮蹂.");
					}

				}
				break;

			// 婦葬濠 賅萄
			case 9:
				while (result != 0) {
					System.out.println("*** 婦葬濠 賅萄 ");
					int password = 1541;
					int inputPassword = 100;
					int count = 3;
					boolean resultBoolean= false;
					String loc = null;

					while (count < 4) {
						System.out.print("綠塵廓�ㄧ� 殮溘ж撮蹂 :");
						try {
						inputPassword = scan.nextInt();
						} catch (Exception e) {
							System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
							// e.printStackTrace();
							result=100;
						}

						// 婦葬濠詭景
						if (password == inputPassword) {
							int mangerResult = 10;
							while (mangerResult != 0) {
								System.out.println("***********婦葬濠 詭景***********");
								System.out.println("  1 - 賅舒 匐儀ж晦");
								System.out.println("  2 - 等檜攪 蹺陛ж晦  ");
								System.out.println("  3 - 熱薑ж晦 ");
								System.out.println("  4 - 餉薯ж晦");
								System.out.println("  0 - 晦獄 詭景煎 給嬴陛晦 ");

								System.out.print(" 詭景蒂 摹鷗ж撮蹂 :  ");
								try {
								mangerResult = scan.nextInt();
								} catch (Exception e) {
									System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
									// e.printStackTrace();
									mangerResult=100;
								}
								switch (mangerResult) {
								case 1:
									System.out.println();
									System.out.println();
									System.out.println("*********** 煎馨檜暮 滌 煽錳 瞪羹 爾晦 **************");
									System.out.println();
									System.out.println();
									System.out.println(
											" 天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天");
									controller.getTotalAll();
									System.out.println(
											" 天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天");
									System.out.println();
									System.out.println();

									System.out.println("*********** 煎馨檜暮 滌 曖猿檣溘熱 瞪羹 爾晦 **************");
									System.out.println();
									System.out.println();
									System.out.println(
											" 天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天");
									controller.getPeopleAll();
									System.out.println(
											"天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天");
									System.out.println();
									System.out.println();
									break;

								case 2:
									System.out.println();
									System.out.println();
									System.out.println("**************  等 檜 攪  蹺 陛 ж 晦  ************** ");
									System.out.println();
									System.out.println();
									System.out.println("1.п渡 雖羲 煽錳 蹺陛 ");
									System.out.println("2.п渡 雖羲 曖猿檣溘 蹺陛 ");
									System.out.println("3.菴煎陛晦");
									System.out.print(" 詭景蒂 堅腦撮蹂 : ");
									try {
									mangerResult = scan.nextInt();
									} catch (Exception e) {
										System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
										// e.printStackTrace();
										mangerResult =100;
									}
									System.out.println();
									int update = 0;
									if (mangerResult == 1) {
										System.out.print("蹺陛 й 雖羲擊 殮溘ж撮蹂:");
										try {
										loc = scan.next();
										} catch (Exception e) {
											System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
											// e.printStackTrace();
											mangerResult=100;
										}
										System.out.print("蹺陛 й 高擊 殮溘ж撮罹 :");
									
										controller.totalInsert(new Hospital_TotalDTO(loc, 1, 2, 3, 4, 5, 6, 7, 8, 9,
												10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26));

									} else if (mangerResult == 2) {
										System.out.print("蹺陛 й 雖羲擊 殮溘ж撮蹂:");
										try {
										loc = scan.next();
										} catch (Exception e) {
											System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
											// e.printStackTrace();
											mangerResult=100;
										}
										System.out.print("蹺陛 й 高擊 殮溘ж撮罹 :");
										controller.peopleInsert(
												new Hospital_PeopleDTO(loc, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
									} else if (mangerResult == 3) {
										break;
									} else {
										System.out.println("澀跤 脹 殮溘殮棲棻. 棻衛 殮溘 п輿撮蹂 ");
									}

									break;

								case 3:
									System.out.println();
									System.out.println();
									System.out.println("**************  等 檜 攪  熱 薑 ж 晦  ************** ");
									System.out.println();
									System.out.println();
									System.out.println("1.п渡 雖羲 煽錳 熱薑 ");
									System.out.println("2.п渡 雖羲 曖猿檣溘 熱薑 ");
									System.out.println("3.菴煎陛晦");
									System.out.println();
									System.out.print(" 詭景蒂 堅腦撮蹂 : ");
									try {
									mangerResult = scan.nextInt();
									} catch (Exception e) {
										System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
										// e.printStackTrace();
										mangerResult=100;
									}

									if (mangerResult == 1) {
										System.out.print("熱薑 й 雖羲擊 殮溘ж撮蹂:");
										try {
										loc = scan.next();
										} catch (Exception e) {
											System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
											// e.printStackTrace();
											mangerResult=100;
										}
										System.out.print("滲唳й 高擊 殮溘ж撮罹 :");
										try {
										update = scan.nextInt();
										controller.totalUpdate(loc, update);

										} catch (Exception e) {
											System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
											// e.printStackTrace();
											mangerResult=100;
										}

									} else if (mangerResult == 2) {
										System.out.print("雖羲擊 殮溘ж撮蹂:");
										try {
										loc = scan.next();
										} catch (Exception e) {
											System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
											// e.printStackTrace();
											mangerResult=100;
										}
										System.out.print("滲唳й 高擊 殮溘ж撮罹 :");
										try {
										update = scan.nextInt();
										controller.peopleUpdate(loc, update);

										} catch (Exception e) {
											System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
											// e.printStackTrace();
											mangerResult=100;
										}

									} else if (mangerResult == 3) {
										break;
									} else {
										System.out.println("澀跤 脹 殮溘殮棲棻. 棻衛 殮溘 п輿撮蹂 ");
									}
									break;

								case 4:
									System.out.println();
									System.out.println();
									while (mangerResult != 3) {
										System.out.println("**************  等 檜 攪  餉 薯 ж 晦  ************** ");
										System.out.println();
										System.out.println();
										System.out.println("1.п渡 雖羲 煽錳 餉薯 ");
										System.out.println("2.п渡 雖羲 曖猿檣溘 餉薯 ");
										System.out.println("3.菴煎陛晦");
										System.out.println();
										System.out.print(" 詭景蒂 堅腦撮蹂 : ");
										try {
										mangerResult = scan.nextInt();} catch (Exception e) {
											System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
											// e.printStackTrace();
											mangerResult=100;
										}
										
										if (mangerResult == 1) {
											System.out.print("餉薯 й 雖羲擊 殮溘ж撮蹂:");
											try {
											loc = scan.next();
											} catch (Exception e) {
												System.out.println("薑�旁� 高擊 殮溘ж撮蹂");
												// e.printStackTrace();
												mangerResult=100;
											}
											try {
												for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
													if (loc == Hospital_TotalDAO.getAll().get(i).getLoc()) {
														controller.totalDelete(loc);
														System.out.println("п渡 雖羲 煽錳 等檜攪 餉薯 撩奢");
													} 
													else {
														System.out.println("п渡ж朝 雖羲擎 襄營ж雖 彊蝗棲棻.");
													}

												}
											} catch (Exception e) {
												System.out.println("薑�旁� 雖羲貲擊 殮溘ж撮蹂 ");
												// e.printStackTrace();
												mangerResult=100;
											}
										} else if (mangerResult == 2) {
											System.out.print("餉薯 й 雖羲擊 殮溘ж撮蹂:");
											try {
												loc = scan.next();
												for (int i = 0; i < Hospital_PeopleDAO.getAll().size(); i++) {
													if (loc == Hospital_PeopleDAO.getAll().get(i).getLoc()) {
														controller.peopleDelete(loc);
														resultBoolean =true;
													} 
												}
												if(resultBoolean) {
													System.out.println("п渡 雖羲 曖猿 檣溘 等檜攪 餉薯 撩奢");
												}
												else {
												System.out.println("п渡ж朝 雖羲擎 襄營ж雖 彊蝗棲棻.");
												}
											} catch (Exception e) {
												System.out.println("薑�旁� 雖羲貲擊 殮溘ж撮蹂 ");
												// e.printStackTrace();
												mangerResult=100;
											}

										} else if (mangerResult == 3) {
											break;
										} else {
											System.out.println("澀跤 脹 殮溘殮棲棻. 棻衛 殮溘 п輿撮蹂 ");
										}
										break;
									}
									
									
								case 0:
									System.out.println("晦獄 詭景煎 給嬴骨棲棻.");
									break;

								}
							}
						} else {
							count--;
							System.out.println("ぬ蝶錶萄陛 ぎ溜蝗棲棻. 棻衛 殮溘п輿撮蹂.");
							System.out.println("3廓 ぎ萵衛 Щ煎斜極擎 謙猿 腌棲棻. ⑷營 : " + count);
							System.out.println();
							if (count == 0) {
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println("綠 薑鼻瞳檣 蕾斬戲煎 檣п Щ煎斜極檜 謙猿 腎歷蝗棲棻.");
								System.exit(0);
							}

						}
					}

				}

				break;
			case 10:
				System.out.println();
				System.out.println("*** Щ煎斜極檜 謙猿 腎歷蝗棲棻. ***");
				break;
			}

		}

	}

	// controller.getPeopleAll();
	// insert - 褒ぬ
	// controller.peopleInsert(new Hospital_PeopleDTO("畦畦選",1,2,3,4,5,6,7,8,9,10));

	// 賅萇 匐儀
	// controller.getPeopleAll();

	// ж釭虜 匐儀 -撩奢
	// controller.getPeople("鬼翕掘");

	// delete - 撩奢
	// controller.peopleDelete("鬼翕掘"); -撩奢
	// controller.peopleDelete("歎だ掘");
	// controller.getPeopleAll();

	// update -- 撩奢
	// controller.peopleUpdate( "辨骯掘",30);
	// controller.getPeopleAll();

	// controller.getTotalAll(); -撩奢
	// controller.getTotal("辨骯掘"); -撩奢
	// controller.totalInsert(new
	// Hospital_TotalDTO("畦畦畦選",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));
	// 褒ぬ !
	// controller.totalDelete("歎だ掘"); --撩奢
	// controller.getTotalAll();
	// controller.totalUpdate( "辨骯掘",30);

}

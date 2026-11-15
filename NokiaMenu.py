print("=========================")
print("     NOKIA 5510")
print("=========================")
print("WELCOME to Nokia 5510")

choice =""

while choice != "0":

  print("\n========== MAIN MENU ==========")
  print("1. Phone book")
  print("2. Messages")
  print("3. Chat")
  print("4. Call register")
  print("5. Tones")
  print("6. Settings")
  print("7. Call divert")
  print("8. Muisc")
  print("9. Games")
  print("10. Calculator")
  print("11. Reminder")
  print("12. Clock")
  print("13. Profiles")
  print("14. WAP services")
  print("15. SIM services")
  print("0. Exit")

  choice = input("\nSelect an option: ")

  if choice =="1":
      print("\nPHONE BOOK")
      print("1.Search")
      print("2.Add a contact")
      print("3.Delete a contact")
      print("0.Exit")
      option = input("Select an option")
      
      if option == "1":
          print("search for contact")
      elif option == "2":
          print("Add a new contact")
      elif option == "3":
          print("Delete a contact")
      elif option == "0":
          print("Exiting phonebook")
      else:
          print("Invalid option")

      input("Press enter to continue..")
    
  elif choice =="2":
      print("\nMESSAGES")
      print("1.Write messages")
      print("2.Inbox")
      print("3.Outbox")
      print("0.Exit")
      option = input("Select an option")

      if option =="1":
          print("Write a new messsage")
      elif option =="2":
          print("Inbox")
      elif option == "3":
          print("Output")
      elif option == "0":
          print("Returning to maim menu")
      else:
          print("Inalid option:")
          
      input("Press Enter to continue..")

  elif choice =="3":
        print("\nCHAT")
        print("Opening chat")
        input("Exit")

  elif choice =="4":
        print("\nCALL REGISTER")
        print("1.Missed calls")
        print("2.Recieved calls")
        print("3.Dialled numbers")
        print("4.Delete recent call lists")
        print("0.Exit")
        option =input("Select an option:")

        if option =="1":
          print("Showing missed calls")
        elif option =="2":
          print("showing recieved calls")
        elif option =="3":
          print("Showing dialled numbers")
        elif option =="4":
          print("Deleting recent call list")
        elif option =="0":
          print("Returning to main menu")
        else:
          print("Invalid option")

        input("Press Enter to continue...")

  elif choice == "5":
        print("\nTONES")
        print("1.Ringing tone")
        print("2.RInging volume")
        print("3.Message alert tone")
        print("0.Exit")
        option = input("Select an option:")

        if option =="1":
          print("Openeing ringtone")
        elif option =="2":
          print("Adjusting ringtone volume")
        elif option =="3":
          print("OPening message alert tone")
        elif option =="0":
          print("returning to main menu")
        else:
          print("Invaid option")

        input("Press enter to contiinue..")
  
  elif choice =="6":
        print("\nSETTINGS")
        print("1.Call setting")
        print("2.Phone setting")
        print("3.Security setting")
        print("4.Restore factory setting")
        print("0.Exit")
        option =input("Select an option:")

        if option =="1":
          print("Opening call settings")
        elif option =="2":
          print("Opening phone settings")
        elif option =="3":
          print("Opening security settings")
        elif option =="4":
          print("Restorimg factory settings")
        elif option =="0":
          print("Returning to main menu")
        else:
          print("Invalid option")

        input("Press enter to continue:")

  elif choice =="7":
        print("\nCALL DIVERT")
        print("1.Divert all calls")
        print("2.Divert all messsages")
        print("3.Exit")

  elif choice =="8":
        music_choice =""
        while music_choice!="0":
         print("\n=========== MUSIC ===========")
         print("1.Music player")
         print("2.Radio")
         print("3.Playlist")
         print("4.Recorder")
         print("0.Exit")

         music_choice =input("Select an option:")

         if music_choice =="1":
            print("Opening music player")
         elif music_choice =="2":
            print("Opening radio")
         elif music_choice =="3":
            print("Opening playlist")
         elif music_choice =="4":
            print("Opening recorder")
         elif music_choice =="0":
            print("Returning to main menu")
         else:
            print("Invalid option")

         if music_choice !="0":
            input("Press enter to continue..")
           
  elif choice =="9":
        print("\nGAMES")
        print("1.Snake game")
        print("2.Sudoku")
        print("0.Exit")
        option =input("Select an option:")

        if option =="1":
          print("Opening snake game")
        elif option =="2":
          print("Opening sudoku")
        elif option =="0":
          print("returning to main menu")
        else:
          print("Invalid option")
        
        input("Press enter to continue:")


  elif choice =="10":
        print("\nCALCULATOR")
        print("1.Addition")
        print("2.Subtraction")
        print("3.Multiplication")
        print("4.Division")
        print("0.Exit")
        option =input("Select an option:")

        if option =="1":
          number1 =float(input("Enter first number:"))
          number2 =float(input("Enter second number:"))
          answer = number1 + number2
          print("Answer:",answer)
        elif option =="2":
          print("Answer:",number1 - number2)
        elif option =="3":
          print("Answer:",number1 * number2)
        elif option =="4":
          if number2 != 0:
           print("Answer:",number1 / number2)
          else:
           print("Cannot divide by zero")
        else:
          print("Invalid option")
        input("Press Enter to continue..")

  elif choice =="11":
        print("\nREMINDERS")
        print("Opening Reminders")
        input("Press Enter to return to main menu")

  elif choice =="12":
        print("\nCLOCK")
        print("1.Alarm clock")
        print("2.Clock settings")
        print("0.Exit")
        option =input("Select an option:")

        if option =="1":
          print("Opening alarm clock")
        elif option =="2":
          print("Opening clock settings")
        elif option =="0":
          print("Returning to main menu")
        else:
          print("Invalid option")

        input("Press enter to continue")

  elif choice =="13":
        print("\nPROFILES")
        print("1.Silent")
        print("2.Loud")
        print("3.Exit")

  elif choice =="14":
        print("\nWAP SERVICES")
        print("Opening wAP services")
        input("Press Enter to return to main menu..")

  elif choice =="15":
        print("\nSIM SERVICES")
        print("Opening SIM services")
        input("Press enter to return to main menu..")

  elif choice =="0":
        print("Goodbye")

  else:
        print("\nInvalid Selection. Try again OGA")

        



















































































































































































































































































































































































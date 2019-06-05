@Autowired
@Qualifier("contactServiceImpl")
private ContactService contactService;

private static final Log log = LogFactory.getLog(ContactController.class);

@GetMapping("/cancel")
public String cancel(){
        return "redirect:/contacts/showContacts";
        }

@GetMapping("/contactForm")
public String redirectContactForm(Model model,
@RequestParam(name = "id", required = false) int id){
        ContactModel contactModel = new ContactModel();
        if(id != 0){
        contactModel = contactService.findContactByIdModel(id);
        }
        model.addAttribute("contactModel", contactModel);
        return ViewConstant.CONTACT_FORM;
        }

@PostMapping("/addcontact")
//El ModelAttribute corresponde con el th:object que utilizamos en la vista de contactform
public String addContact(@ModelAttribute(name = "contactModel")
                             ContactModel contactModel,
                                     Model model){
                                     log.info("Method: addContact() -- Params: "+contactModel.toString());
                                     if(contactService.addContact(contactModel) != null){
                                     model.addAttribute("result", 1);//esto es para que se muestre un mensaje de que se agregó éxitosamente
                                     }else{
                                     model.addAttribute("result", 0);
                                     }
                                     return "redirect:/contacts/showContacts";
                                     }

@GetMapping("/showContacts")
public ModelAndView showContacts(){
        ModelAndView mav = new ModelAndView(ViewConstant.CONTACTS);
        System.out.println(contactService.listAllContacts());
        mav.addObject("contacts", contactService.listAllContacts());
        return mav;
        }

@GetMapping("/removeContact")
public ModelAndView removeContact(@RequestParam(name = "id", required = true) int id){
        contactService.removeContact(id);
        return showContacts();
        }

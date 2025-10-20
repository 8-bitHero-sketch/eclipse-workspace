package resumeCode;

import java.time.LocalDate;

public class resume {

	public static void main(String[] args) {
		
		 
		        // Personal Info
		        String name = "Orion Burnette";
		        int age = 42;
		        String phone = "(702) 801-7033";
		        String email = "orionburnette@gmail.com";
		        String location = "Henderson, NV 89002";
		        String linkedin = "www.linkedin.com/in/orion-burnette-23112b116";
		        LocalDate today = LocalDate.now();

		        // Resume Content
		        String education = """
		        Education
		        ACT score verification: https://myworkkeys.act.org/mwk/certMgmt.do?event=go
		        G.E.D — 2000
		        CSN Back-End Program Engineering — Currently attending; expected completion Feb. 26
		        sketch/labs_Week_2/blob/main/src/labs_Week_2/booleanConditionalsLoops
		        """;

		        String experience = """
		        Professional Experience
		        Lead Xpress Operator
		        Cardinal Paint and Powder — June 22 – June 25
		        Dedicated and detail-oriented Lead Xpress Operator with over 3 years of experience in
		        powder production and team management. Proven ability to oversee operations efficiently
		        while ensuring quality standards are met and maintaining a safe work environment. Strong
		        leadership skills with a focus on continuous improvement and team development. A
		        committed team player who thrives in collaborative environments, whether leading a team
		        or working alongside colleagues.
		        • Managed a team of 7 in powdered materials production, ensuring consistent quality
		          and operational efficiency.
		        • Supervised end-to-end production from weight-outs to machine operation, enforcing
		          safety and regulatory compliance.
		        • Developed and implemented standard operating procedures that improved
		          throughput and reduced incidents.
		        • Led regular equipment and safety training, raising team competency and reducing
		          downtime.
		        • Partnered with quality control to ensure all batches met specifications, minimizing
		          waste and rework.
		        • Reviewed batch formulas and raw-material handling to ensure production accuracy
		          and compliance.
		        • Assisted with machine maintenance and troubleshooting to minimize downtime and
		          support continuous operation.
		        • Maintained organized, safe workspaces and adhered to company safety policies.
		        • Documented production processes and quality checks to support traceability and
		          audits.

		        Commissary Driver / Head of Shipping and Receiving
		        Nevada Restaurant Services (Hoover Dam Lodge) — Oct 2018 – 2022
		        • Delivered commissary supplies to multiple sites operating large vehicles with a
		          safety-first mindset.
		        • Established and managed the shipping and receiving department, streamlining
		          logistics and workflows.

		        Stage Crew, Las Vegas NV — Feb 2018 – 2022
		        • Supported warehouse operations, shipping and receiving, and live-event stage
		          setups.
		        • Demonstrated adaptability, teamwork, and reliable execution under time
		          constraints.

		        Customer Service Representative
		        Family Dollar, Pahrump NV — Apr 2017 – Jun 2017
		        • Delivered customer service, managed daily store operations, and maintained
		          inventory accuracy.

		        Manager / Co-owner
		        Sun Willow Pet Co — 2009 – 2015
		        • Oversaw bookings, customer relations, inventory control, and staff training to drive
		          operational efficiency.
		        """;

		        String certifications = """
		        Certifications
		        OSHA 10 — June 2018 – Present
		        Forklift Operator License — per company
		        """;

		        String skills = """
		        Skills
		        • Team Leadership & Management
		        • Quality Control & Assurance
		        • Process Improvement & Safety Management
		        • Equipment Maintenance & Troubleshooting
		        • Effective Communication & Collaboration
		        • Organizational & Time Management
		        """;

		        String additional = """
		        Additional Information
		        • Proficient with Personal Protective Equipment (PPE) and committed to workplace safety.
		        • Authorized to work in the United States for any employer.
		        • Familiar with Microsoft Office and common office equipment for documentation and reporting.
		        """;

		        // Output
		        System.out.println("Date: " + today);
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Phone: " + phone);
		        System.out.println("Email: " + email);
		        System.out.println("Location: " + location);
		        System.out.println("LinkedIn: " + linkedin);
		        System.out.println();
		        System.out.println(education);
		        System.out.println(experience);
		        System.out.println(certifications);
		        System.out.println(skills);
		        System.out.println(additional);
		    }
		
		
		
		
		
	}



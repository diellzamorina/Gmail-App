package com.example.mymail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Toast
import android.widget.Toolbar
import com.example.mymail.adapter.MailAdapter
import com.example.mymail.controller.MailDetailsActivity
import com.example.mymail.databinding.ActivityMainBinding
import com.example.mymail.model.EmailUser

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mailList: List<EmailUser>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        mailList = listOf(
            EmailUser(
                R.drawable.img_3,
                "Cacttus Education",
                "Pagesa semestrale",
                "Përshëndetje të nderuar student,\n" +
                        "Uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education.Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës.\n" +
                        "Plotësimi i anketës nuk ju merr më shumë se 5 minuta kohë, por do të ketë fuqi shumë të madhe pēr përmirësimin e kualitetit të shkollës qe ju e vijoni. ",
                "08:00"

            ),
            EmailUser(
                R.drawable.img_2,
                "Shqipdon Mehmeti",
                "Projekti i parë",
                "Pershendetje ,\n" +
                        "Per shkak se javen tjeter i kemi 6 ore atehere po e shtyj mbrojtjen e projektit per datat 08.12 ( e enjte ) dhe 09.12 ( e premte ).\n" +
                        "Projektet ua bej assign me daten 02.12( kete te premte )dhe pastaj keni kohe deri me daten 08.12 ne oren 16:00 ta beni upload ne assignment.\n" +
                        "Pra po ua spjegoj edhe njehere ecurine e mbrojtjes se projektit :",
                "09:00"
            ),
            EmailUser(
                R.drawable.img_4,
                "Cacttus Sha",
                "Caltech Coding Bootcamp || Simplilearn",
                "Founded in 1891, Caltech is a world-renowned science and engineering institute that marshals some of the world’s brightest minds and most innovative tools to address fundamental scientific questions. The contributions of Caltech’s faculty and alumni have earned national and international recognition, including 46 Nobel Prizes and nearly 60 National Medals of Science. ",
                "10:00"
            ),
            EmailUser(
                R.drawable.img_5,
                "Cacttus CBS",
                "About Caltech",
                "Founded in 1891, Caltech is a world-renowned science and engineering institute that marshals some of the world’s brightest minds and most innovative tools to address fundamental scientific questions. The contributions of Caltech’s faculty and alumni have earned national and international recognition, including 46 Nobel Prizes and nearly 60 National Medals of Science. ",
                "11:00"
            ),
            EmailUser(
                R.drawable.img_6,
                "Cacttus First",
                "About the program",
                "\n" +
                        "This Caltech Coding Bootcamp will help you master both front-end and back-end Java technologies, starting with the basics and progressing to the advanced aspects of Full Stack Web Development. In this Bootcamp, you will learn Angular, Spring Boot, web services, JSPs, and MongoDB to help you launch your career as a full-stack developer.\n" +
                        "During Caltech Coding Bootcamp, you will learn the most in-demand skills with motivated students, passionate teachers, and a hands-on curriculum teaching you how to tackle industry challenges on the job.",
                "20:00"
            ),
            EmailUser(
                R.drawable.img_7,
                "Cacttus Yummy",
                "During Caltech",
                "During Caltech Coding Bootcamp, you will learn the most in-demand skills with motivated students, passionate teachers, and a hands-on curriculum teaching you how to tackle industry challenges on the job.\n" +
                           "The Caltech Coding Boot Camp is a 16-week full-stack web development course that gives learners the knowledge and skills to build dynamic end-to-end web applications and become full-stack web developers. The program covers aspects like",
                "21:00"
            ),


            EmailUser(
                R.drawable.img_8,
                "Cacttus Happy",
                "Key features of this program",
                "Caltech CTME Bootcamp Certificate\n" +
                        "Physical Certificate from Caltech CTME\n" +
                        "Online Convocation by Caltech CTME Program Director\n" +
                        "Receive up to 17 official Continuing Education Units (CEUs)\n" +
                        "Masterclasses taught by Caltech CTME instructor\n" +
                        "Caltech CTME Circle Membership\n" +
                        "Exclusive access to Caltech events ",
                "22:10"
            ),
            EmailUser(
                R.drawable.img_9,
                "Cacttus Angry",
                "Upon building a Git Portfolio",
                "Create your own page on the web to showcase your skills\n" +
                        "Build a complete profile from scratch\n" +
                        "Implement and reserve code to a shared repository",
                "15:00"
            ),
            EmailUser(
                R.drawable.img_10,
                "Cacttus Working",
                "Learning Path",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës.",
                "13:00"
            ),
            EmailUser(
                R.drawable.img_12,
                "Cacttus Friendly ",
                "Skills Covered",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "23:40"
            ),
            EmailUser(
                R.drawable.img_13,
                "Cacttus Hug ",
                "Skills Covered",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "23:45"
            ),
            EmailUser(
                R.drawable.img_11,
                "Harrisia",
                "Skills Covered",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "12:00"
            ),

            EmailUser(
                R.drawable.img_14,
                "Cacttus Lule",
                "Cacttus Story",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "23:30"
            ),
            EmailUser(
                R.drawable.img_15,
                "Cacttus Three",
                "Another Cacttus Story",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "23:35"
            ),


            EmailUser(
                R.drawable.img_16,
                "Cacttus Many",
                "Another Cacttus Story",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "24:35"
            ),
            EmailUser(
                R.drawable.img_17,
                "Cacttus Filani",
                "Another Cacttus Story",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "24:35"
            ),
            EmailUser(
                R.drawable.img_18,
                "Cacttus Fisteku",
                "Another Cacttus Story",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "24:35"
            ),
            EmailUser(
                R.drawable.img_19,
                "Cacttus Hasani",
                "Another Cacttus Story",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "24:35"
            ),
            EmailUser(
                R.drawable.img_20,
                "Cacttus Hyseni",
                "Another Cacttus Story",
                "Përshëndetje të nderuar student, uroj që jeni mirë me shëndet dhe mësimet po ju shkojnë mbarë !\n" +
                        "Ju ftojmë të plotësoni anketën të cilën e kemi përpiluar për përmirësimin e përvojes tuaj në Cacttus Education. Anketa është plotësisht anonime, edhe të dhënat do të përdoren vetëm me përdorimin e brendshëm të shkollës. ",
                "24:35"
            ),

        )


        val moviesAdapter = MailAdapter(this, mailList)

        binding.listview.adapter = moviesAdapter


        binding.listview.setOnItemClickListener { adapterView, view, position, l ->

            val intent = Intent(this, MailDetailsActivity::class.java)
            intent.putExtra("email_photo", mailList[position].profilePicture)
            intent.putExtra("email_username", mailList[position].Userame)
            intent.putExtra("email_subject", mailList[position].Subject)
            intent.putExtra("email_longmessage", mailList[position].LongMessage)
            intent.putExtra("email_time", mailList[position].Time)
            startActivity(intent)
        }

        createAdapterAndSetToListView()
        onDescendingBtnClick()
        onAscendingBtnClick()
        restoreList()
    }


   private  fun sortingFromHighestToLowest() {
            val sorted= mailList.sortedByDescending { it.Time }
            val adapter1 =MailAdapter(this,sorted)
            binding.listview.adapter = adapter1
        }

    private  fun onDescendingBtnClick() {
            binding.btnOldest.setOnClickListener {
                sortingFromHighestToLowest()
            }
        }

    private fun sortingFromLowestToHighest() {
            val sorted= mailList.toMutableList().sortedBy { it.Time }
            val adapter = MailAdapter(this, sorted)
            binding.listview.adapter = adapter
        }

    private fun onAscendingBtnClick() {
            binding.btnNewest.setOnClickListener {
                sortingFromLowestToHighest()
            }
        }

    private fun createAdapterAndSetToListView() {
            val adapter = MailAdapter(this, mailList)
            binding.listview.adapter = adapter
        }

    private fun restoreList() {
            binding.btngoBack.setOnClickListener {
                createAdapterAndSetToListView()
            }
        }

}
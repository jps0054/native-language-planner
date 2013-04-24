package com.stealth.mylanguage;


import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
     * will keep every loaded fragment in memory. If this becomes too memory
     * intensive, it may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the app.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		super.onOptionsItemSelected(item);
		int id = item.getItemId();
		switch(id)
		{
		case R.id.menu_settings1:
								Intent eng = new Intent(this,English.class);
								finish();
								startActivity(eng);
								break;
		default:	Toast.makeText(this, "Sorry Activity not found!!!", Toast.LENGTH_LONG).show();
		}
		return false;

	}
    

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a DummySectionFragment (defined as a static inner class
            // below) with the page number as its lone argument.
            Fragment fragment = new DummySectionFragment();
            Bundle args = new Bundle();
            args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.title_section1).toUpperCase();
                case 1:
                    return getString(R.string.title_section2).toUpperCase();
                case 2:
                    return getString(R.string.title_section3).toUpperCase();
                case 3:
                	return getString(R.string.title_section4).toUpperCase();
            }
            return null;
        }
    }

    /**
     * A dummy fragment representing a section of the app, but that simply
     * displays dummy text.
     */
    public static class DummySectionFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        public static final String ARG_SECTION_NUMBER = "section_number";
    	
        
        
        
        public DummySectionFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Create a new TextView and set its text to the fragment's section
            // number argument value.
        	
        	
        	LinearLayout.LayoutParams params = new LinearLayout.LayoutParams( 
        			LinearLayout.LayoutParams.WRAP_CONTENT, 
        			LinearLayout.LayoutParams.WRAP_CONTENT); 
        	
        	/*~~~~~~~~~~~~~~~~~~~~~~~*/

        	LinearLayout l = new LinearLayout(getActivity());
        	l.setOrientation(LinearLayout.VERTICAL);
        	LinearLayout l1 = new LinearLayout(getActivity());
        	l1.setGravity(Gravity.CENTER_HORIZONTAL);
        	LinearLayout l2 = new LinearLayout(getActivity());
        	l2.setGravity(Gravity.CENTER_HORIZONTAL);
        	LinearLayout l3 = new LinearLayout(getActivity());
        	l3.setGravity(Gravity.CENTER_HORIZONTAL);
        	LinearLayout l4 = new LinearLayout(getActivity());
        	l4.setOrientation(LinearLayout.VERTICAL);
        	l4.setGravity(Gravity.CENTER_HORIZONTAL);
        	
        	LinearLayout l41 = new LinearLayout(getActivity());
        	l41.setOrientation(LinearLayout.HORIZONTAL);
        	l41.setGravity(Gravity.CENTER_HORIZONTAL);
        	LinearLayout l42 = new LinearLayout(getActivity());
        	l42.setOrientation(LinearLayout.HORIZONTAL);
        	l42.setGravity(Gravity.CENTER_HORIZONTAL);
        	
        	Button b1 = new Button(getActivity());
        	b1.setLayoutParams (new LayoutParams(70, 50));
        	Button b2 = new Button(getActivity());
        	b2.setLayoutParams (new LayoutParams(70, 50));
        	Button b3 = new Button(getActivity());
        	b3.setLayoutParams (new LayoutParams(70, 50));
        	Button b4 = new Button(getActivity());
        	b4.setLayoutParams (new LayoutParams(70, 50));
        	Button b5 = new Button(getActivity());
        	b5.setLayoutParams (new LayoutParams(70, 50));
        	Button b6 = new Button(getActivity());
        	b6.setLayoutParams (new LayoutParams(70, 50));
        	Button b7 = new Button(getActivity());
        	b7.setLayoutParams (new LayoutParams(70, 50));
        	Button b8 = new Button(getActivity());
        	b8.setLayoutParams (new LayoutParams(70, 50));
        	Button b9 = new Button(getActivity());
        	b9.setLayoutParams (new LayoutParams(70, 50));
        	Button b10 = new Button(getActivity());
        	b10.setLayoutParams (new LayoutParams(70, 50));
        	Button b11 = new Button(getActivity());
        	b11.setLayoutParams (new LayoutParams(70, 50));
        	Button b12 = new Button(getActivity());
        	b12.setLayoutParams (new LayoutParams(70, 50));
        	Button b13 = new Button(getActivity());
        	b13.setLayoutParams (new LayoutParams(70, 50));
        	Button b14 = new Button(getActivity());
        	b14.setLayoutParams (new LayoutParams(70, 50));
            
        	final TextView textView = new TextView(getActivity());
            final ImageView img = new ImageView(getActivity());
            final TextView txt = new TextView(getActivity());
            
            img.setLayoutParams(new LayoutParams(500,400));
            textView.setTextColor(Color.rgb(0x00, 0x00, 0x00));
            txt.setTextColor(Color.rgb(0x00, 0x00, 0x00));
            
        	textView.setTextSize(30);
        	txt.setTextSize(30);
        	
            
        	switch(getArguments().getInt(ARG_SECTION_NUMBER))
        	{
        	case 1:	b1.setText(R.string.bt1);
        			b2.setText(R.string.bt2);
        			b3.setText(R.string.bt3);
        			b4.setText(R.string.bt4);
        			b5.setText(R.string.bt5);
        			b6.setText(R.string.bt6);
        			b7.setText(R.string.bt7);
        			b8.setText(R.string.bt8);
        			b9.setText(R.string.bt9);
        			b10.setText(R.string.bt10);
        			b11.setText(R.string.bt11);
        			b12.setText(R.string.bt12);
        			b13.setText(R.string.bt13);
        			b14.setText(R.string.bt14);
        			
        			img.setBackgroundResource(R.drawable.img1);
                	textView.setText(R.string.a1);
                	txt.setText(R.string.item1);
        			
        			b1.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0001);
							
							mp.start(); 
							textView.setText(R.string.a1);
		        			img.setBackgroundResource(R.drawable.img1);
		        			txt.setText(R.string.item1);
						}
					});
        			b2.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0003);
							
							mp.start(); 
							textView.setText(R.string.a2);
		        			img.setBackgroundResource(R.drawable.img2);
		        			txt.setText(R.string.item2);
						}
					});
        			b3.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0004);
							
							mp.start();
							textView.setText(R.string.a3);
		        			img.setBackgroundResource(R.drawable.img3);
		        			txt.setText(R.string.item3);
						}
					});
        			b4.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0006);
							
							mp.start();
							textView.setText(R.string.a4);
		        			img.setBackgroundResource(R.drawable.img4);
		        			txt.setText(R.string.item4);
						}
					});

        			b5.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0008);
							
							mp.start();
							textView.setText(R.string.a5);
		        			img.setBackgroundResource(R.drawable.img5);
		        			txt.setText(R.string.item5);
						}
					});

        			b6.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0009);
							
							mp.start();
							textView.setText(R.string.a6);
		        			img.setBackgroundResource(R.drawable.img6);
		        			txt.setText(R.string.item6);
						}
					});
        			b7.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0011);
							
							mp.start();
							textView.setText(R.string.a7);
		        			img.setBackgroundResource(R.drawable.img7);
		        			txt.setText(R.string.a7);
						}
					});
        			b8.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0012);
							
							mp.start();
							textView.setText(R.string.a8);
		        			img.setBackgroundResource(R.drawable.img8);
		        			txt.setText(R.string.item8);
						}
					});
        			b9.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0013);
							
							mp.start();
							textView.setText(R.string.a9);
		        			img.setBackgroundResource(R.drawable.img9);
		        			txt.setText(R.string.item9);
						}
					});
        			b10.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0014);
							
							mp.start();
							textView.setText(R.string.a10);
		        			img.setBackgroundResource(R.drawable.img10);
		        			txt.setText(R.string.item10);
						}
					});
        			b11.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0015);
							
							mp.start();
							textView.setText(R.string.a11);
		        			img.setBackgroundResource(R.drawable.img11);
		        			txt.setText(R.string.item11);
						}
					});
        			b12.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0018);
							
							mp.start();
							textView.setText(R.string.a12);
		        			img.setBackgroundResource(R.drawable.img12);
		        			txt.setText(R.string.item12);
						}
					});
        			b13.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0020);
							
							mp.start();
							textView.setText(R.string.a13);
		        			img.setBackgroundResource(R.drawable.img13);
		        			txt.setText(R.string.item13);
						}
					});
        			b14.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0021);
							
							mp.start();
							textView.setText(R.string.a14);
		        			img.setBackgroundResource(R.drawable.img14);
		        			txt.setText(R.string.item14);
						}
					});
		
        			break;
        			
        			
        	case 2:	b1.setText(R.string.bt15);
				b2.setText(R.string.bt16);
				b3.setText(R.string.bt17);
				b4.setText(R.string.bt18);
				b5.setText(R.string.bt19);
				b6.setText(R.string.bt20);
				b7.setText(R.string.bt21);
				b8.setText(R.string.bt22);
				b9.setText(R.string.bt23);
				b10.setText(R.string.bt24);
				b11.setText(R.string.bt25);
				b12.setText(R.string.bt26);
				b13.setText(R.string.bt27);
				b14.setText(R.string.bt28);
				
				img.setBackgroundResource(R.drawable.img15);
            	textView.setText(R.string.a15);
            	txt.setText(R.string.item15);
            	
			b1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0023);
					
					mp.start();
					textView.setText(R.string.a15);
        			img.setBackgroundResource(R.drawable.img15);
        			txt.setText(R.string.item15);
				}
			});
			b2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0027);
					
					mp.start();
					textView.setText(R.string.a16);
        			img.setBackgroundResource(R.drawable.img16);
        			txt.setText(R.string.item16);
				}
			});
			b3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0029);
					
					mp.start();
					textView.setText(R.string.a17);
        			img.setBackgroundResource(R.drawable.img17);
        			txt.setText(R.string.item17);
				}
			});
			b4.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0030);
					
					mp.start();
					textView.setText(R.string.a18);
        			img.setBackgroundResource(R.drawable.img18);
        			txt.setText(R.string.item18);
				}
			});

			b5.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0032);
					
					mp.start();
					textView.setText(R.string.a19);
        			img.setBackgroundResource(R.drawable.img19);
        			txt.setText(R.string.item19);
				}
			});

			b6.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0034);
					
					mp.start();
					textView.setText(R.string.a20);
        			img.setBackgroundResource(R.drawable.img20);
        			txt.setText(R.string.item20);
				}
			});
			b7.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0035);
					
					mp.start();
					textView.setText(R.string.a21);
        			img.setBackgroundResource(R.drawable.img21);
        			txt.setText(R.string.a21);
				}
			});
			b8.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0036);
					
					mp.start();
					textView.setText(R.string.a22);
        			img.setBackgroundResource(R.drawable.img22);
        			txt.setText(R.string.item22);
				}
			});
			b9.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0040);
					
					mp.start();
					textView.setText(R.string.a23);
        			img.setBackgroundResource(R.drawable.img23);
        			txt.setText(R.string.item23);
				}
			});
			b10.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0039);
					
					mp.start();
					textView.setText(R.string.a24);
        			img.setBackgroundResource(R.drawable.img24);
        			txt.setText(R.string.item24);
				}
			});
			b11.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0041);
					
					mp.start();
					textView.setText(R.string.a25);
        			img.setBackgroundResource(R.drawable.img25);
        			txt.setText(R.string.item25);
				}
			});
			b12.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0043);
					
					mp.start();
					textView.setText(R.string.a26);
        			img.setBackgroundResource(R.drawable.img26);
        			txt.setText(R.string.item26);
				}
			});
			b13.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0046);
					
					mp.start();
					textView.setText(R.string.a27);
        			img.setBackgroundResource(R.drawable.img27);
        			txt.setText(R.string.item27);
				}
			});
			b14.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0047);
					
					mp.start();
					textView.setText(R.string.a28);
        			img.setBackgroundResource(R.drawable.img28);
        			txt.setText(R.string.item28);
				}
			});

			break;
			
        	case 3:	b1.setText(R.string.bt29);
			b2.setText(R.string.bt30);
			b3.setText(R.string.bt31);
			b4.setText(R.string.bt32);
			b5.setText(R.string.bt33);
			b6.setText(R.string.bt34);
			b7.setText(R.string.bt35);
			b8.setText(R.string.bt36);
			b9.setText(R.string.bt37);
			b10.setText(R.string.bt38);
			b11.setText(R.string.bt39);
			b12.setText(R.string.bt40);
			b13.setText(R.string.bt41);
			b14.setText(R.string.bt42);
			
			img.setBackgroundResource(R.drawable.img29);
        	textView.setText(R.string.a29);
        	txt.setText(R.string.item29);
			
			b1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0048);
					
					mp.start();
					textView.setText(R.string.a29);
        			img.setBackgroundResource(R.drawable.img29);
        			txt.setText(R.string.item29);
				}
			});
			b2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0050);
					
					mp.start();
					textView.setText(R.string.a30);
        			img.setBackgroundResource(R.drawable.img30);
        			txt.setText(R.string.item30);
				}
			});
			b3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0052);
					
					mp.start();
					textView.setText(R.string.a31);
        			img.setBackgroundResource(R.drawable.img31);
        			txt.setText(R.string.item31);
				}
			});
			b4.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0053);
					
					mp.start();
					textView.setText(R.string.a32);
        			img.setBackgroundResource(R.drawable.img32);
        			txt.setText(R.string.item32);
				}
			});

			b5.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0055);
					
					mp.start();
					textView.setText(R.string.a33);
        			img.setBackgroundResource(R.drawable.img33);
        			txt.setText(R.string.item33);
				}
			});

			b6.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0056);
					
					mp.start();
					textView.setText(R.string.a34);
        			img.setBackgroundResource(R.drawable.img34);
        			txt.setText(R.string.item34);
				}
			});
			b7.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0057);
					
					mp.start();
					textView.setText(R.string.a35);
        			img.setBackgroundResource(R.drawable.img35);
        			txt.setText(R.string.a35);
				}
			});
			b8.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0058);
					
					mp.start();
					textView.setText(R.string.a36);
        			img.setBackgroundResource(R.drawable.img36);
        			txt.setText(R.string.item36);
				}
			});
			b9.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0059);
					
					mp.start();
					textView.setText(R.string.a37);
        			img.setBackgroundResource(R.drawable.img37);
        			txt.setText(R.string.item37);
				}
			});
			b10.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0060);
					
					mp.start();
					textView.setText(R.string.a38);
        			img.setBackgroundResource(R.drawable.img38);
        			txt.setText(R.string.item38);
				}
			});
			b11.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0061);
					
					mp.start();
					textView.setText(R.string.a39);
        			img.setBackgroundResource(R.drawable.img39);
        			txt.setText(R.string.item39);
				}
			});
			b12.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0062);
					
					mp.start();
					textView.setText(R.string.a40);
        			img.setBackgroundResource(R.drawable.img40);
        			txt.setText(R.string.item40);
				}
			});
			b13.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0063);
					
					mp.start();
					textView.setText(R.string.a41);
        			img.setBackgroundResource(R.drawable.img41);
        			txt.setText(R.string.item41);
				}
			});
			b14.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0065);
					
					mp.start();
					textView.setText(R.string.a42);
        			img.setBackgroundResource(R.drawable.img42);
        			txt.setText(R.string.item42);
				}
			});

			break;
			
        	case 4:	b1.setText(R.string.bt43);
			b2.setText(R.string.bt44);
			b3.setText(R.string.bt45);
			b4.setText(R.string.bt46);
			b5.setText(R.string.bt47);
			b6.setText(R.string.bt48);
			b7.setText(R.string.bt49);
			b8.setText(R.string.bt50);
			b9.setText(R.string.bt51);
			b10.setText(R.string.bt52);
			b11.setText(R.string.bt53);
			b12.setText(R.string.bt54);
			b13.setText(R.string.bt55);
			b14.setText(R.string.bt56);
			
			img.setBackgroundResource(R.drawable.img43);
        	textView.setText(R.string.a43);
        	txt.setText(R.string.item43);
        	
			b1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0066);
					
					mp.start();
					textView.setText(R.string.a43);
        			img.setBackgroundResource(R.drawable.img43);
        			txt.setText(R.string.item43);
				}
			});
			b2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0068);
					
					mp.start();
					textView.setText(R.string.a44);
        			img.setBackgroundResource(R.drawable.img44);
        			txt.setText(R.string.item44);
				}
			});
			b3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0069);
					
					mp.start();
					textView.setText(R.string.a45);
        			img.setBackgroundResource(R.drawable.img45);
        			txt.setText(R.string.item45);
				}
			});
			b4.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0070);
					
					mp.start();
					textView.setText(R.string.a46);
        			img.setBackgroundResource(R.drawable.img46);
        			txt.setText(R.string.item46);
				}
			});

			b5.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0071);
					
					mp.start();
					textView.setText(R.string.a47);
        			img.setBackgroundResource(R.drawable.img47);
        			txt.setText(R.string.item47);
				}
			});

			b6.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0073);
					
					mp.start();
					textView.setText(R.string.a48);
        			img.setBackgroundResource(R.drawable.img48);
        			txt.setText(R.string.item48);
				}
			});
			b7.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0074);
					
					mp.start();
					textView.setText(R.string.a49);
        			img.setBackgroundResource(R.drawable.img49);
        			txt.setText(R.string.a49);
				}
			});
			b8.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0075);
					
					mp.start();
					textView.setText(R.string.a50);
        			img.setBackgroundResource(R.drawable.img50);
        			txt.setText(R.string.item50);
				}
			});
			b9.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0077);
					
					mp.start();
					textView.setText(R.string.a51);
        			img.setBackgroundResource(R.drawable.img51);
        			txt.setText(R.string.item51);
				}
			});
			b10.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0078);
					
					mp.start();
					textView.setText(R.string.a52);
        			img.setBackgroundResource(R.drawable.img52);
        			txt.setText(R.string.item52);
				}
			});
			b11.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0079);
					
					mp.start();
					textView.setText(R.string.a53);
        			img.setBackgroundResource(R.drawable.img53);
        			txt.setText(R.string.item53);
				}
			});
			b12.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0080);
					
					mp.start();
					textView.setText(R.string.a54);
        			img.setBackgroundResource(R.drawable.img54);
        			txt.setText(R.string.item54);
				}
			});
			b13.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0081);
					
					mp.start();
					textView.setText(R.string.a55);
        			img.setBackgroundResource(R.drawable.img55);
        			txt.setText(R.string.item55);
				}
			});
			b14.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.voice0084);
					
					mp.start();
					textView.setText(R.string.a56);
        			img.setBackgroundResource(R.drawable.img56);
        			txt.setText(R.string.item56);
				}
			});


			break;
			
			
        			
        	}
        
        	
        	l41.addView(b1);
        	l41.addView(b2);
        	l41.addView(b3);
        	l41.addView(b4);
        	l41.addView(b5);
        	l41.addView(b6);
        	l41.addView(b7);
        	
        	l42.addView(b8);
        	l42.addView(b9);
        	l42.addView(b10);
        	l42.addView(b11);
        	l42.addView(b12);
        	l42.addView(b13);
        	l42.addView(b14);
        	
        	l4.addView(l41);
        	l4.addView(l42);
        	
        	l3.addView(txt);
        	l2.addView(img);
        	l1.addView(textView);
        	l.setBackgroundColor(Color.rgb(0xff, 0xff, 0xff));
        	l.addView(l1);
        	l.addView(l2);
        	l.addView(l3);
        	l.addView(l4);
        	
        	/*~~~~~~~~~~~~~~~~~~~~~~~~*/
        	//Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER))
        	
        	
            return l;
        }
    }

}

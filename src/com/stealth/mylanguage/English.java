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
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;


public class English extends FragmentActivity{

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
	        getMenuInflater().inflate(R.menu.activity_mal, menu);
	        return true;
	    }
	    
	    @Override
		public boolean onOptionsItemSelected(MenuItem item)
		{
			super.onOptionsItemSelected(item);
			int id = item.getItemId();
			switch(id)
			{
			case R.id.menu_settings2:
									Intent mal = new Intent(this,MainActivity.class);
									finish();
									startActivity(mal);
									break;
			default: Toast.makeText(this, "Sorry Activity not found!!!", Toast.LENGTH_LONG).show();
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
	            return 2;
	        }

	        @Override
	        public CharSequence getPageTitle(int position) {
	            switch (position) {
	                case 0:
	                    return getString(R.string.title_section1).toUpperCase();
	                case 1:
	                    return getString(R.string.title_section2).toUpperCase();


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
	        	case 1:	b1.setText(R.string.ea1);
	        			b2.setText(R.string.ea2);
	        			b3.setText(R.string.ea3);
	        			b4.setText(R.string.ea4);
	        			b5.setText(R.string.ea5);
	        			b6.setText(R.string.ea6);
	        			b7.setText(R.string.ea7);
	        			b8.setText(R.string.ea8);
	        			b9.setText(R.string.ea9);
	        			b10.setText(R.string.ea10);
	        			b11.setText(R.string.ea11);
	        			b12.setText(R.string.ea12);
	        			b13.setText(R.string.ea13);

	        			
	    	        	img.setBackgroundResource(R.drawable.eimage1);
	    	        	textView.setText(R.string.ea1);
	    	        	txt.setText(R.string.eitem1);
	        			
	        			b1.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v1);
								
								mp.start(); 
								textView.setText(R.string.ea1);
			        			img.setBackgroundResource(R.drawable.eimage1);
			        			txt.setText(R.string.eitem1);
							} 
						});
	        			b2.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v2);
								
								mp.start(); 
								textView.setText(R.string.ea2);
			        			img.setBackgroundResource(R.drawable.eimage2);
			        			txt.setText(R.string.eitem2);
							}
						});
	        			b3.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v3);
								
								mp.start();
								textView.setText(R.string.ea3);
			        			img.setBackgroundResource(R.drawable.eimage3);
			        			txt.setText(R.string.eitem3);
							}
						});
	        			b4.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v4);
								
								mp.start();
								textView.setText(R.string.ea4);
			        			img.setBackgroundResource(R.drawable.eimage4);
			        			txt.setText(R.string.eitem4);
							}
						});

	        			b5.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v5);
								
								mp.start();
								textView.setText(R.string.ea5);
			        			img.setBackgroundResource(R.drawable.eimage5);
			        			txt.setText(R.string.eitem5);
							}
						});

	        			b6.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v6);
								
								mp.start();
								textView.setText(R.string.ea6);
			        			img.setBackgroundResource(R.drawable.eimage6);
			        			txt.setText(R.string.eitem6);
							}
						});
	        			b7.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v7);
								
								mp.start();
								textView.setText(R.string.ea7);
			        			img.setBackgroundResource(R.drawable.eimage7);
			        			txt.setText(R.string.eitem7);
							}
						});
	        			b8.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v8);
								
								mp.start();
								textView.setText(R.string.ea8);
			        			img.setBackgroundResource(R.drawable.eimage8);
			        			txt.setText(R.string.eitem8);
							}
						});
	        			b9.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v9);
								
								mp.start();
								textView.setText(R.string.ea9);
			        			img.setBackgroundResource(R.drawable.eimage9);
			        			txt.setText(R.string.eitem9);
							}
						});
	        			b10.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v10);
								
								mp.start();
								textView.setText(R.string.ea10);
			        			img.setBackgroundResource(R.drawable.eimage10);
			        			txt.setText(R.string.eitem10);
							}
						});
	        			b11.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v11);
								
								mp.start();
								textView.setText(R.string.ea11);
			        			img.setBackgroundResource(R.drawable.eimage11);
			        			txt.setText(R.string.eitem11);
							}
						});
	        			b12.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v12);
								
								mp.start();
								textView.setText(R.string.ea12);
			        			img.setBackgroundResource(R.drawable.eimage12);
			        			txt.setText(R.string.eitem12);
							}
						});
	        			b13.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v13);
								
								mp.start();
								textView.setText(R.string.ea13);
			        			img.setBackgroundResource(R.drawable.eimage13);
			        			txt.setText(R.string.eitem13);
							}
						});
	        		
	        			break;
	        			
	        			
	        	case 2:	b1.setText(R.string.ea14);
					b2.setText(R.string.ea15);
					b3.setText(R.string.ea16);
					b4.setText(R.string.ea17);
					b5.setText(R.string.ea18);
					b6.setText(R.string.ea19);
					b7.setText(R.string.ea20);
					b8.setText(R.string.ea21);
					b9.setText(R.string.ea22);
					b10.setText(R.string.ea23);
					b11.setText(R.string.ea24);
					b12.setText(R.string.ea25);
					b13.setText(R.string.ea26);
					
					img.setBackgroundResource(R.drawable.eimage14);
    	        	textView.setText(R.string.ea14);
    	        	txt.setText(R.string.eitem14);
				
				b1.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v14);
						
						mp.start();
						textView.setText(R.string.ea14);
	        			img.setBackgroundResource(R.drawable.eimage14);
	        			txt.setText(R.string.eitem14);
					}
				});
				b2.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v15);
						
						mp.start();
						textView.setText(R.string.ea15);
	        			img.setBackgroundResource(R.drawable.eimage15);
	        			txt.setText(R.string.eitem15);
					}
				});
				b3.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v16);
						
						mp.start();
						textView.setText(R.string.ea16);
	        			img.setBackgroundResource(R.drawable.eimage16);
	        			txt.setText(R.string.eitem16);
					}
				});
				b4.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v17);
						
						mp.start();
						textView.setText(R.string.ea17);
	        			img.setBackgroundResource(R.drawable.eimage17);
	        			txt.setText(R.string.eitem17);
					}
				});

				b5.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v18);
						
						mp.start();
						textView.setText(R.string.ea18);
	        			img.setBackgroundResource(R.drawable.eimage18);
	        			txt.setText(R.string.eitem18);
					}
				});

				b6.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v19);
						
						mp.start();
						textView.setText(R.string.ea19);
	        			img.setBackgroundResource(R.drawable.eimage19);
	        			txt.setText(R.string.eitem19);
					}
				});
				b7.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v20);
						
						mp.start();
						textView.setText(R.string.ea20);
	        			img.setBackgroundResource(R.drawable.eimage20);
	        			txt.setText(R.string.eitem20);
					}
				});
				b8.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v21);
						
						mp.start();
						textView.setText(R.string.ea21);
	        			img.setBackgroundResource(R.drawable.eimage21);
	        			txt.setText(R.string.eitem21);
					}
				});
				b9.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v22);
						
						mp.start();
						textView.setText(R.string.ea22);
	        			img.setBackgroundResource(R.drawable.eimage22);
	        			txt.setText(R.string.eitem22);
					}
				});
				b10.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v23);
						
						mp.start();
						textView.setText(R.string.ea23);
	        			img.setBackgroundResource(R.drawable.eimage23);
	        			txt.setText(R.string.eitem23);
					}
				});
				b11.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v24);
						
						mp.start();
						textView.setText(R.string.ea24);
	        			img.setBackgroundResource(R.drawable.eimage24);
	        			txt.setText(R.string.eitem24);
					}
				});
				b12.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v25);
						
						mp.start();
						textView.setText(R.string.ea25);
	        			img.setBackgroundResource(R.drawable.eimage25);
	        			txt.setText(R.string.eitem25);
					}
				});
				b13.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.v26);
						
						mp.start();
						textView.setText(R.string.ea26);
	        			img.setBackgroundResource(R.drawable.eimage26);
	        			txt.setText(R.string.eitem26);
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

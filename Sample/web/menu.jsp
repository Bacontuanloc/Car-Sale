<%@page import="entity.Gallery"%>
<%@page import="entity.User"%>
<%@page import="model.DBConnection"%>
<%@page import="model.GalleryDAO"%>
<%@page import="entity.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.CategoryDAO"%>
<%@page import="entity.Category"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%
    DBConnection dbCon = new DBConnection();
    CategoryDAO daoCate = new CategoryDAO();
    ArrayList<Category> cateList = daoCate.getAllCategories();
    DAOPlatform daoPlat = new DAOPlatform(dbCon);
    ArrayList<Platform> platList = daoPlat.getAllPlatforms();
%>
<!DOCTYPE html>
<!--[if IE 9 ]> <html lang="vi" class="ie9 loading-site no-js"> <![endif]-->
<!--[if IE 8 ]> <html lang="vi" class="ie8 loading-site no-js"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="vi" class="loading-site no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script>(function (html) {
                html.className = html.className.replace(/\bno-js\b/, 'js')
            })(document.documentElement);</script>
        <title>BMAZON</title>
        <link rel="stylesheet" href="css/1.css">
        <link rel='stylesheet' id='contact-form-7-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/contact-form-7/includes/css/styles.css?ver=4.9.1' type='text/css' media='all' />
        <link rel='stylesheet' id='menu-image-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/menu-image/menu-image.css?ver=1.1' type='text/css' media='all' />
        <link rel='stylesheet' id='woof-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/woocommerce-products-filter/css/front.css?ver=4.8.14' type='text/css' media='all' />
        <link rel='stylesheet' id='chosen-drop-down-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/woocommerce-products-filter/js/chosen/chosen.min.css?ver=4.8.14' type='text/css' media='all' />
        <link rel='stylesheet' id='woof_by_text_html_items-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/woocommerce-products-filter/ext/by_text/css/by_text.css?ver=4.8.14' type='text/css' media='all' />
        <link rel='stylesheet' id='woof_color_html_items-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/woocommerce-products-filter/ext/color/css/html_types/color.css?ver=4.8.14' type='text/css' media='all' />
        <link rel='stylesheet' id='woof_label_html_items-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/woocommerce-products-filter/ext/label/css/html_types/label.css?ver=4.8.14' type='text/css' media='all' />
        <link rel='stylesheet' id='woof_select_hierarchy_html_items-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/woocommerce-products-filter/ext/select_hierarchy/css/html_types/select_hierarchy.css?ver=4.8.14' type='text/css' media='all' />
        <link rel='stylesheet' id='woof_select_radio_check_html_items-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/woocommerce-products-filter/ext/select_radio_check/css/html_types/select_radio_check.css?ver=4.8.14' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-icons-css'  href='http://mauweb.monamedia.net/lazada/wp-content/themes/flatsome/assets/css/fl-icons.css?ver=3.3' type='text/css' media='all' />
        <link rel='stylesheet' id='easy-social-share-buttons-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/easy-social-share-buttons3/assets/css/default-retina/easy-social-share-buttons.css?ver=3.7.3' type='text/css' media='all' />
        <link rel='stylesheet' id='essb-cct-style-css'  href='http://mauweb.monamedia.net/lazada/wp-content/plugins/easy-social-share-buttons3/lib/modules/click-to-tweet/assets/css/styles.css?ver=3.7.3' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-main-css'  href='http://mauweb.monamedia.net/lazada/wp-content/themes/flatsome/assets/css/flatsome.css?ver=3.4.0' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-shop-css'  href='http://mauweb.monamedia.net/lazada/wp-content/themes/flatsome/assets/css/flatsome-shop.css?ver=3.4.0' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-style-css'  href='http://mauweb.monamedia.net/lazada/wp-content/themes/flatsome-child/style.css?ver=3.4.0' type='text/css' media='all' />
        <script type='text/javascript' src='http://mauweb.monamedia.net/lazada/wp-includes/js/jquery/jquery.js?ver=1.12.4'></script>
        <script type='text/javascript' src='http://mauweb.monamedia.net/lazada/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.4.1'></script>
        <link rel='https://api.w.org/' href='http://mauweb.monamedia.net/lazada/wp-json/' />
        <link rel='stylesheet' href="css/home.css"  type='text/css'>
        <style>.bg{opacity: 0; transition: opacity 1s; -webkit-transition: opacity 1s;} .bg-loaded{opacity: 1;}</style><!--[if IE]><link rel="stylesheet" type="text/css" href="http://mauweb.monamedia.net/lazada/wp-content/themes/flatsome/assets/css/ie-fallback.css"><script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.1/html5shiv.js"></script><script>var head = document.getElementsByTagName('head')[0],style = document.createElement('style');style.type = 'text/css';style.styleSheet.cssText = ':before,:after{content:none !important';head.appendChild(style);setTimeout(function(){head.removeChild(style);}, 0);</script><script src="http://mauweb.monamedia.net/lazada/wp-content/themes/flatsome/assets/libs/ie-flexibility.js"></script><![endif]--> 
        <script src="js/1.js"></script>
        <noscript><style>.woocommerce-product-gallery{ opacity: 1 !important; }</style></noscript>
        <link rel='stylesheet' href="css/2.css"  type='text/css'>
        <link rel='stylesheet' href="css/3.css"  type='text/css'> 

        <script src="js/2.js"></script>

        <script src="js.home.js"></script>
    </head>
    <body class="home page-template page-template-page-blank page-template-page-blank-php page page-id-16 page-parent lightbox nav-dropdown-has-arrow" >
        <div id="wrapper">


            <header id="header" class="header has-sticky sticky-jump">
                <div class="header-wrapper">
                    <div id="top-bar" class="header-top hide-for-sticky nav-dark">
                        <div class="flex-row container">
                            <div class="flex-col hide-for-medium flex-left">
                                <ul class="nav nav-left medium-nav-center nav-small  nav-">
                                </ul>
                            </div><!-- flex-col left -->

                            <div class="flex-col hide-for-medium flex-center">
                                <ul class="nav nav-center nav-small  nav-">
                                </ul>
                            </div><!-- center -->

                            <div class="flex-col hide-for-medium flex-right">
                                <ul class="nav top-bar-nav nav-right nav-small  nav-">
                                    <li class="html custom html_topbar_left"><p class="topbarlink"><a href="http://mauweb.monamedia.net/lazada/tai-app-mona/" style="color:#ff7941">Tải App Mona</a></p></li><li class="html custom html_topbar_right"><p class="topbarlink"><a href="http://mauweb.monamedia.net/lazada/cong-tac-cung-mona/" style="color:#37cfdd">Cộng tác cùng Mona</a></p></li><li class="html custom html_top_right_text"><p class="topbarlink"><a href="#">Chăm sóc khách hàng</a></p></li><li class="html custom html_nav_position_text_top"><p class="topbarlink"><a href="#">Kiểm tra đơn hàng</a></p></li><li class="account-item has-icon
                                                                                                                                                                                                        "
                                                                                                                                                                                                        >

                                        <a href="http://mauweb.monamedia.net/lazada/tai-khoan/"
                                           class="nav-top-link nav-top-not-logged-in "
                                           data-open="#login-form-popup"  >
                                            <span>
                                                Đăng nhập     / Đăng ký  </span>

                                        </a><!-- .account-login-link -->



                                    </li>
                                    <li class="has-dropdown header-language-dropdown">
                                        <a href="#">
                                            Languages				<i class="icon-angle-down" ></i>	</a>
                                        <ul class="nav-dropdown nav-dropdown-simple">
                                            <li><a>You need Polylang or WPML plugin for this to work. You can remove it from Theme Options.</a></li>	</ul>
                                    </li>
                                </ul>
                            </div><!-- .flex-col right -->

                            <div class="flex-col show-for-medium flex-grow">
                                <ul class="nav nav-center nav-small mobile-nav  nav-">
                                    <li class="html custom html_topbar_left"><p class="topbarlink"><a href="http://mauweb.monamedia.net/lazada/tai-app-mona/" style="color:#ff7941">Tải App Mona</a></p></li>          </ul>
                            </div>

                        </div><!-- .flex-row -->
                    </div><!-- #header-top -->
                    <div id="masthead" class="header-main nav-dark">
                        <div class="header-inner flex-row container logo-left medium-logo-center" role="navigation">

                            <!-- Logo -->
                            <div id="logo" class="flex-col logo">
                                <!-- Header logo -->
                                <a href="http://mauweb.monamedia.net/lazada/" title="Lazada - Một trang web mới sử dụng WordPress" rel="home">
                                    <img width="124" height="75" src="http://mauweb.monamedia.net/lazada/wp-content/uploads/2017/11/logo-ecommerce-1.svg" class="header_logo header-logo" alt="Lazada"/><img  width="124" height="75" src="http://mauweb.monamedia.net/lazada/wp-content/uploads/2017/11/logo-ecommerce-1.svg" class="header-logo-dark" alt="Lazada"/></a>
                            </div>

                            <!-- Mobile Left Elements -->
                            <div class="flex-col show-for-medium flex-left">
                                <ul class="mobile-nav nav nav-left ">
                                    <li class="nav-icon has-icon">
                                        <a href="#" data-open="#main-menu" data-pos="left" data-bg="main-menu-overlay" data-color="" class="is-small" aria-controls="main-menu" aria-expanded="false">

                                            <i class="icon-menu" ></i>
                                        </a>
                                    </li>            </ul>
                            </div>

                            <!-- Left Elements -->
                            <div class="flex-col hide-for-medium flex-left
                                 flex-grow">
                                <ul class="header-nav header-nav-main nav nav-left  nav-uppercase" >
                                    <li class="header-search-form search-form html relative has-icon">
                                        <div class="header-search-form-wrapper">
                                            <div class="searchform-wrapper ux-search-box relative form- is-normal"><form method="get" class="searchform" action="http://mauweb.monamedia.net/lazada/" role="search">
                                                    <div class="flex-row relative">
                                                        <div class="flex-col flex-grow">
                                                            <input type="search" class="search-field mb-0" name="s" value="" placeholder="Tìm sản phẩm, thương hiệu và tên shop" />
                                                            <input type="hidden" name="post_type" value="product" />
                                                        </div><!-- .flex-col -->
                                                        <div class="flex-col">
                                                            <button type="submit" class="ux-search-submit submit-button secondary button icon mb-0">
                                                                <i class="icon-search" ></i>				</button>
                                                        </div><!-- .flex-col -->
                                                    </div><!-- .flex-row -->
                                                    <div class="live-search-results text-left z-top"></div>
                                                </form>
                                            </div>	</div>
                                    </li><li class="cart-item has-icon
                                             has-dropdown">

                                        <a href="http://mauweb.monamedia.net/lazada/gio-hang/" title="Giỏ hàng" class="header-cart-link is-small">



                                            <i class="icon-shopping-cart"
                                               data-icon-label="0">
                                            </i>
                                        </a>

                                        <ul class="nav-dropdown nav-dropdown-simple">
                                            <li class="html widget_shopping_cart">
                                                <div class="widget_shopping_cart_content">


                                                    <p class="woocommerce-mini-cart__empty-message">Chưa có sản phẩm trong giỏ hàng.</p>


                                                </div>
                                            </li>
                                        </ul><!-- .nav-dropdown -->

                                    </li>
                                </ul>
                            </div>

                            <!-- Right Elements -->
                            <div class="flex-col hide-for-medium flex-right">
                                <ul class="header-nav header-nav-main nav nav-right  nav-uppercase">
                                    <li class="html custom html_nav_position_text"><img class="header_promotion" src="http://mauweb.monamedia.net/lazada/wp-content/uploads/2017/11/or-header.png" alt="promotion" height="40" width="170"></li>            </ul>
                            </div>

                            <!-- Mobile Right Elements -->
                            <div class="flex-col show-for-medium flex-right">
                                <ul class="mobile-nav nav nav-right ">
                                    <li class="cart-item has-icon">


                                        <a href="http://mauweb.monamedia.net/lazada/gio-hang/" class="header-cart-link off-canvas-toggle nav-top-link is-small" data-open="#cart-popup" data-class="off-canvas-cart" title="Giỏ hàng" data-pos="right">

                                            <i class="icon-shopping-cart"
                                               data-icon-label="0">
                                            </i>
                                        </a>


                                        <!-- Cart Sidebar Popup -->
                                        <div id="cart-popup" class="mfp-hide widget_shopping_cart">
                                            <div class="cart-popup-inner inner-padding">
                                                <div class="cart-popup-title text-center">
                                                    <h4 class="uppercase">Giỏ hàng</h4>
                                                    <div class="is-divider"></div>
                                                </div>
                                                <div class="widget_shopping_cart_content">


                                                    <p class="woocommerce-mini-cart__empty-message">Chưa có sản phẩm trong giỏ hàng.</p>


                                                </div>
                                                <div class="cart-sidebar-content relative"></div>  </div>
                                        </div>

                                    </li>
                                </ul>
                            </div>

                        </div><!-- .header-inner -->

                        <!-- Header divider -->
                        <div class="container"><div class="top-divider full-width"></div></div>
                    </div><!-- .header-main --><div id="wide-nav" class="header-bottom wide-nav nav-dark flex-has-center hide-for-medium">
                        <div class="flex-row container">


                            <div class="flex-col hide-for-medium flex-center">
                                
                                <ul class="nav header-nav header-bottom-nav nav-center  nav-line-bottom nav-spacing-xsmall nav-uppercase">
                                    <li  class="menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-has-children  menu-item-1236 has-dropdown"><a href="http://mauweb.monamedia.net/lazada/danh-muc/bach-hoa-online/" class="menu-image-title-after nav-top-link"><span class="menu-image-title">Bách hóa online</span></a>
                                        <ul class='nav-dropdown nav-dropdown-simple'>
                                            <li id="menu-item-1237" class="menu-item menu-item-type-taxonomy menu-item-object-product_cat  menu-item-1237"><a href="http://mauweb.monamedia.net/lazada/danh-muc/bach-hoa-online/an-vat-banh-keo/" class="menu-image-title-after"><span class="menu-image-title">Ăn vặt &#038; Bánh kẹo</span></a></li>
                                            <li id="menu-item-1238" class="menu-item menu-item-type-taxonomy menu-item-object-product_cat  menu-item-1238"><a href="http://mauweb.monamedia.net/lazada/danh-muc/bach-hoa-online/dac-san-viet/" class="menu-image-title-after"><span class="menu-image-title">Đặc sản Việt</span></a></li>
                                            <li id="menu-item-1239" class="menu-item menu-item-type-taxonomy menu-item-object-product_cat  menu-item-1239"><a href="http://mauweb.monamedia.net/lazada/danh-muc/bach-hoa-online/dau-hat/" class="menu-image-title-after"><span class="menu-image-title">Đậu &#038; Hạt</span></a></li>
                                            <li id="menu-item-1240" class="menu-item menu-item-type-taxonomy menu-item-object-product_cat  menu-item-1240"><a href="http://mauweb.monamedia.net/lazada/danh-muc/bach-hoa-online/do-hop-dong-goi/" class="menu-image-title-after"><span class="menu-image-title">Đồ hộp &#038; Đóng gói</span></a></li>
                                        </ul>
                                    </li>
                                   
                                </ul>
                            </div><!-- flex-col -->



                        </div><!-- .flex-row -->
                    </div><!-- .header-bottom -->

                    <div class="header-bg-container fill"><div class="header-bg-image fill"></div><div class="header-bg-color fill"></div></div><!-- .header-bg-container -->   </div><!-- header-wrapper-->
            </header>

    </body>
</html>
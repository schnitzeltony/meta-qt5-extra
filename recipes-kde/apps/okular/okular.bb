SUMMARY = "KDE document viewer"
LICENSE = "BSD-2-Clause & BSD-3-Clause & GFDL-1.2 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.0-or-later & MIT & X11"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=f225922a2c12dfa5218fb70c49db3ea6 \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9f58808219e9a42ff1228309d6f83dc6 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/GPL-3.0-or-later.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
    file://LICENSES/X11.txt;md5=87f08485cf6ba3c63a00eda8ecba7f1d \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += " \
    ki18n-native \
    kconfig-native \
    kauth-native \
    kcoreaddons-native \
    kdoctools-native \
    sonnet-native \
    libkexiv2 \
    qtspeech \
    qca \
    tiff \
    kpty \
    poppler \
    libzip \
    kactivities \
    karchive \
    kbookmarks \
    kcompletion \
    kconfigwidgets \
    kdbusaddons \
    kiconthemes \
    kirigami2 \
    purpose \
    kjs \
    kio \
    ki18n \
    kparts \
    threadweaver \
    kwallet \
    khtml \
    kwindowsystem \
    libspectre \
    chmlib \
    discount \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "42bbaae82d6e914d18becb663d220b35d4e3cfeed21d69dd4fd87b98b774919e"

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
    -DFORCE_NOT_REQUIRED_DEPENDENCIES="DjVuLibre;EPub;QMobipocket;" \
"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/config.kcfg \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org \
"

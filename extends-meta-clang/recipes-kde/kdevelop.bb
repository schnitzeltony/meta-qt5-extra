SUMMARY = "Cross-platform IDE for C, C++, Python, QML/JavaScript and PHP"
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=4e290b17e3e05732730de37b44abef90 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/GPL-3.0-or-later.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/MIT.txt;md5=4dd71a82d66fd9e3ca0cc65b8be370c0 \
"

inherit kde-apps gettext pkgconfig gtk-icon-cache mime mime-xdg bash-completion

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdevelop-pg-qt-native \
    kdoctools-native \
    ki18n-native \
    kpackage-native \
    shared-mime-info-native \
    \
    qtbase \
    qtdeclarative \
    qtwebengine \
    grantlee \
    libkomparediff2 \
    libksysguard \
    karchive \
    kcmutils \
    kconfig \
    kcrash \
    kdeclarative \
    kdevelop-pg-qt \
    kguiaddons \
    kiconthemes \
    kitemmodels \
    kitemviews \
    kjobwidgets \
    kio \
    knewstuff \
    knotifications \
    knotifyconfig \
    kparts \
    krunner \
    kservice \
    ktexteditor \
    kxmlgui \
    kwindowsystem \
    okteta \
    purpose \
    threadweaver \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "ab7a1828ab67475c85d84f603ab245fa762006d1a4953be42add2dfd23ae4a16"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

do_configure:append() {
    # although the name is missleading I still love cmake_extra_sanity.bbclass...
    sed -i \
        -e 's:${STAGING_DIR_NATIVE}::g' \
        -e 's:${STAGING_DIR_HOST}::g' \
        ${B}/plugins/clang/libclang_include_path.h
}

# Yeah nasty but...
FILES_SOLIBSDEV = "${libdir}/libKDevC*so ${libdir}/libKDevPlatform*so"

FILES:${PN} += " \
    ${datadir}/kdev* \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${datadir}/knotifications5 \
    ${datadir}/mime \
    ${datadir}/plasma \
    ${libdir}/libKDevelopSessionsWatch.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

RDEPENDS:${PN} += " \
    bash \
    zsh \
"

# To give best user experience out of the box..
RRECOMMENDS:${PN} += " \
    packagegroup-qt5-toolchain-target \
    binutils \
    ccache \
    make \
    gcc-symlinks g++-symlinks cpp-symlinks \
    gdb \
    cmake \
    ninja \
    python3-core \
    qtwebengine-dev \
    qtwebengine-mkspecs \
    qtwebengine-plugins \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'qtwebengine-qmlplugins', '', d)} \
"


SUMMARY = "Cross-platform IDE for C, C++, Python, QML/JavaScript and PHP"
LICENSE = "GPLv2 & GFDL-1.2 & LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-base gettext pkgconfig gtk-icon-cache mime mime-xdg bash-completion

python() {
    if 'clang-layer' not in d.getVar('BBFILE_COLLECTIONS').split():
        raise bb.parse.SkipRecipe('Requires meta-clang to be present due to qttools-native - see extends-meta-qt5/qttools_git.bbappend.')
}

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

PV = "5.5.2"
SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/src/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "228e981a268704fef0f8fa437e37e3e2e0d261d3a2afbabff0f4d060c31f74da"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

do_configure_append() {
    # although the name is missleading I still love cmake_extra_sanity.bbclass...
    sed -i 's:${STAGING_DIR_NATIVE}::g' ${B}/plugins/clang/libclang_include_path.h
}

FILES_${PN} += " \
    ${datadir}/kdev* \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${datadir}/knotifications5 \
    ${datadir}/mime \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

RDEPENDS_${PN} += " \
    bash \
    zsh \
"

# To give best user experience out of the box..
RRECOMMENDS_${PN} += " \
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


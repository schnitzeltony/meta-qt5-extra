SUMMARY = "Various packaging tools and scripts for LXQt applications"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://BSD-3-Clause;md5=a8987c1fd6930fe14ae46b4d72e53770"

# lxqt.bbclass adds an inherit on this recipe
inherit cmake_qt5_extra

do_configure_append() {
    sed -i 's:set(LXQT_ETC_XDG_DIR.*:set(LXQT_ETC_XDG_DIR        "${sysconfdir}/xdg"):' ${B}/install/LXQtConfigVars.cmake
}

SRC_URI = "git://github.com/lxde/${BPN}.git;protocol=git;branch=master"
SRCREV = "3934e9cd7ae20b7ecb1829b9007c201cb1211b77"
PV = "0.6.0"
S = "${WORKDIR}/git"

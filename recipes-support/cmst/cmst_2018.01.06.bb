SUMMARY = "QT GUI for Connman with system tray icon"
HOMEPAGE = "https://github.com/andrew-bibb/cmst"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://apps/cmstapp/code/main.cpp;beginline=6;endline=25;md5=a2b717df62aa34074acde09599278068"
LIC_FILES_CHKSUM = "file://apps/rootapp/code/main.cpp;beginline=6;endline=25;md5=a2b717df62aa34074acde09599278068"

inherit qmake5 gtk-icon-cache

DEPENDS += "connman qtbase"

SRC_URI = "git://github.com/andrew-bibb/cmst.git"
SRCREV = "cf41767dfbb849f9c05bcdfc7fcb6a37c90b2ad0"
S = "${WORKDIR}/git"

# the *.pro file use some paths, e.g. for install which require ${B} = ${S}
B = "${S}"

EXTRA_QMAKEVARS_PRE += "DISTRO=debian"

# split out the big icons which consume 1.7M space
PACKAGES =+ "${PN}-big-icon"

FILES_${PN} += " \
  ${datadir}/dbus-1/system-services/org.cmst.roothelper.service \
  ${datadir}/metainfo/org.cmst.cmst.appdata.xml \
  ${datadir}/cmst/autostart/cmst-autostart.desktop \
  ${datadir}/licenses/cmst/LICENSE \
"

FILES_${PN}-big-icon += "${datadir}/icons/hicolor/???x???/*"

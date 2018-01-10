SUMMARY = "LXQt system-tray applet for connman"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += " \
    liblxqt \
    connman \
    qtsvg \
"

SRCREV = "940493ce509bb2784738d547cc27df677b4835a2"
PV = "0"

FILES_${PN}-dev += " \
    ${datadir}/lxqt/lxqt-connman-applet \
"

FILES_${PN}-locale += " \
    ${datadir}/lxqt/translations \
"

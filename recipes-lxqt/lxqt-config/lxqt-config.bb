SUMMARY = "LXQt system settings center"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libkscreen libxcursor libxi xf86-input-libinput"

SRCREV = "f22cee687bf186d5c1875ae921331c7ba0cc4955"
PV = "0.16.1"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/lxqt/icons \
    ${datadir}/desktop-directories \
"

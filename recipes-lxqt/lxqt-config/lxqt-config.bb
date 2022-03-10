SUMMARY = "LXQt system settings center"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libkscreen libxcursor libxi xf86-input-libinput"

SRCREV = "65ca00892fd37bf9847ca53b645d081ac6e97a1c"
PV = "1.0.0"

FILES:${PN} += " \
    ${datadir}/icons \
    ${datadir}/lxqt/icons \
    ${datadir}/desktop-directories \
"

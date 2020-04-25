SUMMARY = "LXQt system settings center"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libkscreen libxcursor libxi xf86-input-libinput"

SRCREV = "e98213d17938779a8a5c7f877a5746c9a7747e85"
PV = "0.15.0"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/lxqt/icons \
"

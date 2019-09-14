SUMMARY = "LXQt system settings center"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libkscreen libxcursor libxi xf86-input-libinput"

SRCREV = "12e8c8f0819e1ed1bf54986ce7aa5e9cba2b55ea"
PV = "0.14.1"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/lxqt/icons \
"

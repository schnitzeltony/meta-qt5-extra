SUMMARY = "Multimedia processing graphs"
HOMEPAGE = "http://pipewire.org/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=d8153c6e65986f862a0550ca74a3ed73 \
    file://LGPL;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit meson

DEPENDS += " \
    dbus \
    glib-2.0 \
    alsa-lib \
    v4l-utils \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
"

SRC_URI = "git://github.com/PipeWire/pipewire.git"
SRCREV = "14ebb85e7482c5b7963d2e647608464f5cd148bb"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${systemd_user_unitdir} \
    ${libdir}/pipewire-0.2 \
    ${libdir}/spa \
    ${libdir}/gstreamer-1.0 \
"


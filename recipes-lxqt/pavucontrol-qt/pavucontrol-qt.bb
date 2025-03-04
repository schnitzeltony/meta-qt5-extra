SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt qt5-translation

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "e4259e112797af251ff2ff606479a4102120f0ae"
PV = "1.4.0"

RDEPENDS:${PN} += "pulseaudio-server"

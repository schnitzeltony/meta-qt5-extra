SUMMARY = "Paper is an icon theme for GTK based desktops and fits perfectly the paper-gtk-theme"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4a312f184ff2ceafe9466cbb7ea43f4e \
"

inherit allarch autotools-brokensep

SRC_URI = "https://github.com/snwh/${BPN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "076e1dfa1bc5928f4c6616ffd933926a"
SRC_URI[sha256sum] = "b90f3a84634572bcba76cdd0c2a0d305a5c521c2054d3d390edffda5f233928b"

FILES_${PN} += "${datadir}/icons"

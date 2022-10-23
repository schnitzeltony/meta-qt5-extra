SUMMARY = "Plasma-specific protocols for Wayland"
LICENSE = "BSD-3-Clause & CC0-1.0 & LGPL-2.1-only & MIT & MIT-CMU"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/MIT-CMU.txt;md5=b6936b5be2ab721140d9bf57c37b0b92 \
"

inherit kde-base

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${BP}.tar.xz"
SRC_URI[sha256sum] = "a4275b9a854716fa5ed9c2ba2d697df2b0749fc45a28ad965e68d0aa36c5d4c8"


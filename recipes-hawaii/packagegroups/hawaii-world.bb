SUMMARY = "Hawaii desktop package collection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    cinema \
    eyesight \
    greenisland \
    hawaii-baseapps \
    hawaii-icon-theme \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "hawaii-shell", "",d)} \
    hawaii-system-preferences \
    hawaii-terminal \
    hawaii-wallpapers \
    hawaii-widget-styles \
    qtaccountsservice \
    qtconfiguration \
    swordfish \
"

# wind was a X11 mauios approach. For dependencies (kdeclarative does not build 
# for raspi) keep out
# wind

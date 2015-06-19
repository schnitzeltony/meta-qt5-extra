PACKAGECONFIG ?= " \
    ${@base_contains('DISTRO_FEATURES','systemd','systemd','consolekit',d)} \
    modemmanager \
    bluez5 \
"

